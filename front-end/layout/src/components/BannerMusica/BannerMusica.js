import CardMusica from "../CardsMusica/CardMusica"
import styles from "./BannerMusica.module.css"


export default function BannerMusica({url}){
    return (
        <div className={styles.bannerMusica}>
            <div className={styles.detalhesMusica}>
                <h1>MÚSICAS</h1>
                <h2>Pabllo Vittar - Amor de que</h2>
                <h2>*****</h2>
                <p>3min 15s</p>
                <br />
                <h3>Albúm - Não para Não</h3>
                <br/>
                <p>Artista premiada com o Prêmio <br />Multishow de Música Brasileira.</p>



            </div>
            <div style={{ backgroundImage: url }} className={styles.Banner}>
                <div className={styles.divCards}>
                    <CardMusica url={`url(https://upload.wikimedia.org/wikipedia/pt/8/83/Capa_de_Dispon%C3%ADvel.png)`}/>
                    <CardMusica url={`url(https://images.genius.com/ea43889c7d5daf50538343e62f8e58c3.458x458x1.png)`}/>
                    <CardMusica url={`url(https://1.bp.blogspot.com/-zXYyhsswTk0/VyekHNu5wwI/AAAAAAAAB3E/KEos5s4K3ccRcxoZr8TNIF21DAptyXlTQCLcB/s1600/13083119_820992651338190_8605970979712220891_n.jpg)`}/>
                    <CardMusica url={`url(https://cdn.iset.io/assets/55268/produtos/35541/quadro-decorativo-led-zeppelin-arte-capa-03.jpg)`}/>
                </div>
            </div>
        </div>
    )
}