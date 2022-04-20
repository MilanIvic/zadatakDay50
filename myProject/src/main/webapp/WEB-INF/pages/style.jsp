<style>
:root{
    --main-color:royalblue;
    --dark-color:rgb(3, 21, 73);
    --light-color:rgb(143, 162, 219);
    --light-darker-color:rgb(96, 120, 190);
}
html, body{
   margin: 0;
   color: white;
   font-size: 17px;
}
header{
	background-color: darkblue;
}
footer{
	background-color: darkblue;
	text-align: center;
}
main{
   display: flex;
   flex-direction:column;
   height: 100vh;
   width: 100%;
   background-color: aqua;
   background-size: cover;
   justify-content: center;
   align-items: center;
}

.gradient{
   display: flex;
   background:linear-gradient(rgba(219, 216, 247, 0.699), rgba(8, 8, 133, 0.76), rgba(0, 0, 8, 0.76));
   justify-content: center;
   align-items: center;
   height: 100%;
   width: 100%;
   backdrop-filter: blur(5px);
   flex-direction:column;
}

.container{
   display:flex ;
   flex-direction: column;
   justify-content: center; 
   flex-wrap: wrap; 
   height: 20rem;
   background-color: rgba(40, 40, 150, 0.404);
   width: 25rem;
   text-align: center;
   border-radius: 8px;
}

h1{
   text-shadow: 2px 2px var(--dark-color);
   padding: 10px;
}
h2{
	font-size: 35px;
}

input{
   padding: 7px;
   margin-bottom: 15px;
   border-radius: 7px;
   width: 10rem;
   box-shadow: 2px 2px var(--dark-color);
}
select{
	padding: 7px;
   	margin-bottom: 15px;
  	border-radius: 7px;
   	width: 10rem;
   	box-shadow: 2px 2px var(--dark-color);
}
a{
	background-color: lightblue;
	font-weight: bold; 
	font-size: 19px;
	border: 2px solid black;
	text-decoration: none;
}

[type=text]:hover{
   background-color: var(--light-color);
}
[type=password]:hover{
   background-color: var(--light-color);
}
[type=submit]{
   background-color: var(--light-color);
   width: 5rem;
   transition: 1s;
   font-weight: bold;    
   font-style: var(--dark-color);
  
}
[type=submit]:hover{
   background-color: var(--light-darker-color);
   transform: scale(1.1);
}
thead{
	background-color: darkblue;
	border 1px solid white;
}
td{
	text-align:center;
    background-color: royalblue;
}
table{
	width: 60%;
	height:40%;
	font-size:1.1rem;
}
</style>
