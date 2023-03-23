import styles from "./BannerHome.module.css"
<<<<<<< HEAD
import { useEffect , useState } from "react"
=======
import { useState } from "react"
>>>>>>> 80ad8f53ee0f55e7837964dbc70d8e7d552e990b
import Card from "../Cards/Card"

export default function BannerHome({url, urlCard1, urlCard2, urlCard3, urlCard4}){

<<<<<<< HEAD
    const [films, setFilms] = useState([{}])

    useEffect(()=>{
        fetch("http://localhost:8090/apivaldisnei/filme")
        .then(response => response.json())
        .then(data => setFilms(data))
      }, [])


    return (
        <div style={{ backgroundImage: url }} className={styles.Banner}>
            <div className={styles.player}>
            </div>
            <span className={styles.textLancamento}>Novidades</span>
            <div className={styles.divCards}>
                {films.filter(filme => filme.id > films.length - 4).map(film => {
                    return (
                        <Card url={film.capa}/>
                    )
                })}
=======
    return (
        <div style={{ backgroundImage: url }} className={styles.Banner}>
            <div className={styles.player}>
                
            </div>
            <div className={styles.divCards}>
                <Card url={urlCard1}/>
                <Card url={urlCard2}/>
                <Card url={urlCard3}/>
                <Card url={urlCard4}/>
>>>>>>> 80ad8f53ee0f55e7837964dbc70d8e7d552e990b
            </div>
        </div>
    )
}