### Spring JSF Template

#### Creating theme.jar file
Required folder structure:

<code>
META-INF<br>
&nbsp;&nbsp;|<br>
&nbsp;&nbsp;- resources<br>
&nbsp;&nbsp;&nbsp;&nbsp;|<br>
&nbsp;&nbsp;&nbsp;&nbsp;- < name-of-your-theme ><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-images
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-theme.css
</code>

Execute the following command in the main directory:

<code>
jar -cvf theme.jar .
</code>

The file theme.jar will be created next to the META-INF folder.

#### Good to know

* folder for theme: /webapp/WEB-INF/lib
* use h:outputScript and h:outputStylesheet for referencing Javascript and CSS
* prevent the folder /webapp/resources for the referenced .css and .js files