package com.mycompany.wackyraces.bean;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;


import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ImageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	StreamedContent penelope;
	StreamedContent dastardly;

	public StreamedContent getPenelope() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("/pics/penelope.jpg");
        return new DefaultStreamedContent(stream);
    }

	public StreamedContent getDastardly() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("/pics/dastardly.jpg");
        return new DefaultStreamedContent(stream);
    }

}

