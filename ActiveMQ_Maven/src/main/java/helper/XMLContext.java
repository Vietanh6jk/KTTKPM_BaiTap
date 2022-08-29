package helper;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLContext<T> {
	private T type;

	public XMLContext(T type) {
		super();
		this.type = type;
	}
	@SuppressWarnings("all")
	public T xml2Object(String xml) throws JAXBException {
		T sv=null;
		JAXBContext ctx= JAXBContext.newInstance(type.getClass());
			Unmarshaller ms= ctx.createUnmarshaller();
			sv= (T) ms.unmarshal(new StringReader(xml));
		return sv;
		
	}
	public String Object2XML(T obj) throws JAXBException {
		JAXBContext ctx= JAXBContext.newInstance(type.getClass());
		Marshaller ms= ctx.createMarshaller();
		StringWriter sw= new StringWriter();
		ms.marshal(obj, sw);
		return sw.toString();
	}
}
