import CardMusica from "../CardsMusica/CardMusica"
import styles from "./BannerMusica.module.css"
import { useEffect, useState } from "react"


export default function BannerMusica({url}){

    const [musics, setMusics] = useState([{}])

    useEffect(()=>{
        fetch("http://localhost:8090/apivaldisnei/musica")
        .then(response => response.json())
        .then(data => setMusics(data))
      }, [])


    return (
        <div className={styles.bannerMusica}>
            <div className={styles.detalhesMusica}>
                <h1>MÚSICAS</h1>
                <h2>{musics[0].artista}</h2>
                <h2>*****</h2>
                <p>{musics[0].duracao}</p>
                <br />
                <h3>{musics[0].titulo}</h3>
                <br/>
                <p>Artista premiada com o Prêmio <br />Multishow de Música Brasileira.</p>



            </div>
            <div style={{ backgroundImage: musics[0].capa }} className={styles.Banner}>
                <div className={styles.divCards}>
                    {musics.filter(music => music.id > musics.length - 4).map(mus =>{
                        return (
                        <CardMusica url={mus.capa} />
                        )
                    })}
                </div>
            </div>
        </div>
    )
}

