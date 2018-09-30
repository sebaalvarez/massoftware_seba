package com.massoftware.windows;

import java.util.Locale;

import com.vaadin.data.util.converter.StringToShortConverter;

public class StringToDoubleConverterUnspecifiedLocale extends
		StringToShortConverter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5943612309620235994L;

	public String convertToPresentation(Double value,
			Class<? extends String> targetType, Locale locale)
			throws ConversionException {
		if (value == null) {
			return null;
		}

		// return getFormat(locale).format(value);
		return value.toString() + "XX";
	}

}
