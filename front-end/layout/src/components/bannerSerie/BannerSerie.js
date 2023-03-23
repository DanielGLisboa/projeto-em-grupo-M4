import styles from "./BannerSerie.module.css"
import { useEffect , useState } from "react"
import Card from "../Cards/Card"

export default function BannerSerie({url}){

    const [serie, setSerie] = useState([{}])

    useEffect(()=>{
        fetch("http://localhost:8090/apivaldisnei/serie")
        .then(response => response.json())
        .then(data => setSerie(data))
      }, [])


    return (
        <div style={{ backgroundImage: url }} className={styles.BannerSerie}>
            <div className={styles.playerSerie}>
            </div>
            <div className={styles.divcard}>
                {serie.filter(seri => seri.id > serie.length - 4).map(ser => {
                    return(
                    <Card url={ser.capa}/>
                    )
                })}
                        
            </div>
        </div>
    )
}


