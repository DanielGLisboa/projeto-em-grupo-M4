import React, { useEffect, useState } from "react";
import Headers from '../../Headers';
import Footer from '../../Footer';
import BannerHome from '../../components/bannerHome/BannerHome';
import styles from "./Catalogos.module.css"
import BannerMusica from '../../components/BannerMusica/BannerMusica';
import Card from '../../components/Cards/Card';
import CardMusica from '../../components/CardsMusica/CardMusica';


export default function Catalogo() {

  const [films, setFilms] = useState([{}])
  
  useEffect(()=>{
    fetch("http://localhost:8090/apivaldisnei/filme")
    .then(response => response.json())
    .then(data => setFilms(data))
  }, films)
  
  

    const [series, setSeries] = useState([
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`},
        {img: `url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg)`}
    ])

    const [musicas, setMusicas] = useState([
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`},
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`},
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`},
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`},
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`},
        {img: `url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`}
    ])

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
                <Card  url={film.capa} />
                )
            })}
    </div>

    <BannerHome url={`url(https://quintacapa.com.br/wp-content/uploads/2019/07/ST-netflix-destaque.png)`}/>
    <div className={styles.maisSeries}>
    {series.map(series =>{
                return(
                <Card url={series.img} />
                )
            })}
       
    </div>

    <BannerMusica url={`url(https://images.squarespace-cdn.com/content/v1/5bff13aa9d5abbb4e18bd5af/1579124429043-O3AAE97TMK2XZ6UMCJ67/blank.jpg)`}/>
    <div className={styles.maisMusicas}>
    {musicas.map(musicas =>{
                return(
                <CardMusica url={musicas.img} />
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


