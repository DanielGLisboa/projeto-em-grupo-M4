import React from 'react';
import styles from './headers.module.css'
import logo from './img/logo.png'
import { Button } from 'reactstrap';


import {
	Collapse,
	Navbar,
	NavbarToggler,
	NavbarBrand,
	Nav,
	NavItem,
	NavLink,
	UncontrolledDropdown,
	DropdownMenu,
	DropdownItem } from 'reactstrap';
  
  export default class Headers extends React.Component {
	constructor(props) {
	  super(props);
  
	  this.toggle = this.toggle.bind(this);
	  this.state = {
		isOpen: false
	  };
	}
	toggle() {
	  this.setState({
		isOpen: !this.state.isOpen
	  });
	}
	render() {
	  return (
		<div>
		  <Navbar color="black" dark expand="md">
			<NavbarBrand href="/">
			<img src={logo} alt="logo" height="30" />
			</NavbarBrand>
			<NavbarToggler onClick={this.toggle} />
			<Collapse className={styles.navOptions} isOpen={this.state.isOpen} navbar>
			<Nav className="ml-auto" navbar>
				<NavItem className={styles.link}>
				  <NavLink href="/components/">Catálogo</NavLink>
				</NavItem>
				<NavItem className={styles.link}>
				  <NavLink href="/components/">Playlists</NavLink>
				</NavItem>
				<NavItem>
				<Button className={styles.buttonEntrar}>Entrar</Button>
				</NavItem>
				<UncontrolledDropdown nav inNavbar>
				  <DropdownMenu right>
					<DropdownItem>
					  Option 1
					</DropdownItem>
					<DropdownItem>
					  Option 2
					</DropdownItem>
					<DropdownItem divider />
					<DropdownItem>
					  Reset
					</DropdownItem>
				  </DropdownMenu>
				</UncontrolledDropdown>
			  </Nav>
			</Collapse>
		  </Navbar>
		</div>
	  );
	}
  }

