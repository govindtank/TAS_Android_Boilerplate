package com.theappsolutions.boilerplate.injection.component;

import com.theappsolutions.boilerplate.injection.ConfigPersistent;
import com.theappsolutions.boilerplate.injection.module.ActivityModule;
import com.theappsolutions.boilerplate.ui.base.BaseActivity;

import dagger.Component;

/**
 * @author Severyn Parkhomenko s.parkhomenko@theappsolutions.com
 * @copyright (c) 2018 TheAppSolutions. (https://theappsolutions.com)
 * <p>
 * A dagger component that will live during the lifecycle of an Activity but it won't
 * be destroy during configuration changes. Check {@link BaseActivity} to see how this components
 * survives configuration changes.
 * Use the {@link ConfigPersistent} scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    ActivityComponent activityComponent(ActivityModule activityModule);
}