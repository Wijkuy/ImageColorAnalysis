package com.wijkuy.imagecoloranalysis.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.core.internal.AbstractApplicationBuilder;
import com.wijkuy.imagecoloranalysis.ImageColorAnalysisApplication;
import com.wijkuy.imagecoloranalysis.ImageColorAnalysisApplicationBuilder;
import com.wijkuy.imagecoloranalysis.ImageColorAnalysisApplicationImpl;
import com.wijkuy.imagecoloranalysis.images.images.images.ImagesManagerImpl;
import com.wijkuy.imagecoloranalysis.images.images.images.ImagesSqlAdapter;

/**
 * A generated base {@link
 * com.speedment.runtime.core.internal.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named images.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedImageColorAnalysisApplicationBuilder extends AbstractApplicationBuilder<ImageColorAnalysisApplication, ImageColorAnalysisApplicationBuilder> {
    
    protected GeneratedImageColorAnalysisApplicationBuilder() {
        super(ImageColorAnalysisApplicationImpl.class, GeneratedImageColorAnalysisMetadata.class);
        withManager(ImagesManagerImpl.class);
        withComponent(ImagesSqlAdapter.class);
    }
    
    @Override
    public ImageColorAnalysisApplication build(Injector injector) {
        return injector.getOrThrow(ImageColorAnalysisApplication.class);
    }
}