package com.wijkuy.imagecoloranalysis.images.images.images.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import com.wijkuy.imagecoloranalysis.images.images.images.Images;
import com.wijkuy.imagecoloranalysis.images.images.images.ImagesManager;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.wijkuy.imagecoloranalysis.images.images.images.Images} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedImagesManagerImpl 
extends AbstractManager<Images> 
implements GeneratedImagesManager {
    
    private final TableIdentifier<Images> tableIdentifier;
    
    protected GeneratedImagesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("images", "images", "images");
    }
    
    @Override
    public TableIdentifier<Images> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Images>> fields() {
        return ImagesManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Images>> primaryKeyFields() {
        return Stream.of(
            Images.ID
        );
    }
}