import React, { useEffect, useState } from "react";
import Headers from '../../Headers';
import Footer from '../../Footer';
import BannerHome from '../../components/bannerHome/BannerHome';
import styles from "./Catalogos.module.css"
import BannerMusica from '../../components/BannerMusica/BannerMusica';
import Card from '../../components/Cards/Card';
import CardMusica from '../../components/CardsMusica/CardMusica';
import BannerSerie from "../../components/bannerSerie/BannerSerie";


export default function Catalogo() {

  const [films, setFilms] = useState([{}])
  
  useEffect(()=>{
    fetch("http://localhost:8090/apivaldisnei/filme")
    .then(response => response.json())
    .then(data => setFilms(data))
  }, [])
  
  
  const [serie, setSerie] = useState([{}])
  
  useEffect(()=>{
    fetch("http://localhost:8090/apivaldisnei/serie")
    .then(response => response.json())
    .then(data => setSerie(data))
  }, [])


  const [musics, setMusics] = useState([{}])

  useEffect(()=>{
      fetch("http://localhost:8090/apivaldisnei/musica")
      .then(response => response.json())
      .then(data => setMusics(data))
    }, [])

  return (
<div className={styles.content}>
    <header className={styles.header}>
      <Headers />
    </header> 
    <main className={styles.main}>
    <BannerHome url={films[0].banner}/>
    <div className={styles.maisFilmes}>
            {films.map(film =>{
                return(
                <Card id={film.id} url={film.capa} />
                )
            })}
    </div>

    <BannerSerie url={`url(https://quintacapa.com.br/wp-content/uploads/2019/07/ST-netflix-destaque.png)`}/>
    <div className={styles.maisSeries}>
    {serie.map(seris =>{
                return(
                <Card  url={seris.capa} />
                )
            })}
       
    </div>

    <BannerMusica url={`url(https://images.squarespace-cdn.com/content/v1/5bff13aa9d5abbb4e18bd5af/1579124429043-O3AAE97TMK2XZ6UMCJ67/blank.jpg)`}/>
    <div className={styles.maisMusicas}>
    {musics.map(musicas =>{
                return(
                <CardMusica url={musicas.capa} />
                )
            })}
    </div>

    </main>
    

   <footer className={styles.footer}>
      <Footer />
    </footer>
</div>
  );
}


