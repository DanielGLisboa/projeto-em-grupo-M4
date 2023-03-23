import React from 'react';
import logo from "../../img/logo.png"
import styles from "../../headers.module.css"
import { Navbar, NavbarBrand, Button } from 'reactstrap';

  export default class HeadersHome extends React.Component {
	render() {
	  return (
		<div>
		  <Navbar color="black" dark expand="md">
			<NavbarBrand href="/">
			<img src={logo} alt="logo" height="30" />
			</NavbarBrand>
				<Button className={styles.buttonEntrar}>Entrar</Button>
		  </Navbar>
		</div>
	  );
	}
  }