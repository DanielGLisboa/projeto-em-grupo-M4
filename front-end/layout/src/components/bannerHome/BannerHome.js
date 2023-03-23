import styles from "./BannerHome.module.css"
import { useEffect , useState } from "react"
import Card from "../Cards/Card"

export default function BannerHome({url, urlCard1, urlCard2, urlCard3, urlCard4}){

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
            </div>
        </div>
    )
}