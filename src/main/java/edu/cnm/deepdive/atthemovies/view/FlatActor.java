package edu.cnm.deepdive.atthemovies.view;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

public interface FlatActor {

  public UUID getId();

  public Date getCreated();

  public Date getUpdated();

  public String getName();

  URI getHref();

}
