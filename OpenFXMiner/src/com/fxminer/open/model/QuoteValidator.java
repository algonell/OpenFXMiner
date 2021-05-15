package com.fxminer.open.model;

/**
 * Provides validation tasks for Quote.
 * 
 * @author Andrew Kreimer
 *
 */
public interface QuoteValidator {

  /**
   * Validates features.
   */
  boolean isCleanAttribute();

  /**
   * Validates class variable.
   */
  boolean isCleanClass();

}
