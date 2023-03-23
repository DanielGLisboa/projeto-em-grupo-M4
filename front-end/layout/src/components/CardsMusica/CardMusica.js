import styles from "./CardMusica.module.css"

export default function CardMusica({url}){

    return (
        <div style={{ backgroundImage: url }} className={styles.Card}>
            <span className={styles.Player}></span>
        </div>
    )
}