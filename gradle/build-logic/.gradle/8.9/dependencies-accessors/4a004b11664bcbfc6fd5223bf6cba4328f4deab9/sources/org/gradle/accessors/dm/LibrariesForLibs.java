package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AdornLibraryAccessors laccForAdornLibraryAccessors = new AdornLibraryAccessors(owner);
    private final FabricLibraryAccessors laccForFabricLibraryAccessors = new FabricLibraryAccessors(owner);
    private final IndraLibraryAccessors laccForIndraLibraryAccessors = new IndraLibraryAccessors(owner);
    private final JeiLibraryAccessors laccForJeiLibraryAccessors = new JeiLibraryAccessors(owner);
    private final JetbrainsLibraryAccessors laccForJetbrainsLibraryAccessors = new JetbrainsLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MockLibraryAccessors laccForMockLibraryAccessors = new MockLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final MongoLibraryAccessors laccForMongoLibraryAccessors = new MongoLibraryAccessors(owner);
    private final SerializationLibraryAccessors laccForSerializationLibraryAccessors = new SerializationLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>architectury</b> with <b>architectury-plugin:architectury-plugin.gradle.plugin</b> coordinates and
     * with version reference <b>architectury.plugin</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getArchitectury() {
        return create("architectury");
    }

    /**
     * Dependency provider for <b>blossom</b> with <b>net.kyori:blossom</b> coordinates and
     * with version reference <b>blossom</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getBlossom() {
        return create("blossom");
    }

    /**
     * Dependency provider for <b>classgraph</b> with <b>io.github.classgraph:classgraph</b> coordinates and
     * with version reference <b>classgraph</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getClassgraph() {
        return create("classgraph");
    }

    /**
     * Dependency provider for <b>forge</b> with <b>net.minecraftforge:forge</b> coordinates and
     * with version reference <b>forge</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getForge() {
        return create("forge");
    }

    /**
     * Dependency provider for <b>graal</b> with <b>org.graalvm.js:js</b> coordinates and
     * with version reference <b>graal</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getGraal() {
        return create("graal");
    }

    /**
     * Dependency provider for <b>icu4j</b> with <b>com.ibm.icu:icu4j</b> coordinates and
     * with version reference <b>icu4j</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getIcu4j() {
        return create("icu4j");
    }

    /**
     * Dependency provider for <b>ideaExt</b> with <b>org.jetbrains.gradle.plugin.idea-ext:org.jetbrains.gradle.plugin.idea-ext.gradle.plugin</b> coordinates and
     * with version reference <b>idea.ext</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getIdeaExt() {
        return create("ideaExt");
    }

    /**
     * Dependency provider for <b>lambDynamicLights</b> with <b>maven.modrinth:lambdynamiclights</b> coordinates and
     * with version reference <b>lambDynamicLights</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getLambDynamicLights() {
        return create("lambDynamicLights");
    }

    /**
     * Dependency provider for <b>licenser</b> with <b>gradle.plugin.org.cadixdev.gradle:licenser</b> coordinates and
     * with version reference <b>licenser</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getLicenser() {
        return create("licenser");
    }

    /**
     * Dependency provider for <b>loom</b> with <b>dev.architectury:architectury-loom</b> coordinates and
     * with version reference <b>loom</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getLoom() {
        return create("loom");
    }

    /**
     * Dependency provider for <b>molang</b> with <b>local.com.bedrockk:molang</b> coordinates and
     * with version reference <b>molang</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMolang() {
        return create("molang");
    }

    /**
     * Dependency provider for <b>shadow</b> with <b>com.github.johnrengelman:shadow</b> coordinates and
     * with version reference <b>shadow</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getShadow() {
        return create("shadow");
    }

    /**
     * Group of libraries at <b>adorn</b>
     */
    public AdornLibraryAccessors getAdorn() {
        return laccForAdornLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fabric</b>
     */
    public FabricLibraryAccessors getFabric() {
        return laccForFabricLibraryAccessors;
    }

    /**
     * Group of libraries at <b>indra</b>
     */
    public IndraLibraryAccessors getIndra() {
        return laccForIndraLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jei</b>
     */
    public JeiLibraryAccessors getJei() {
        return laccForJeiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jetbrains</b>
     */
    public JetbrainsLibraryAccessors getJetbrains() {
        return laccForJetbrainsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mock</b>
     */
    public MockLibraryAccessors getMock() {
        return laccForMockLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mockito</b>
     */
    public MockitoLibraryAccessors getMockito() {
        return laccForMockitoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mongo</b>
     */
    public MongoLibraryAccessors getMongo() {
        return laccForMongoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>serialization</b>
     */
    public SerializationLibraryAccessors getSerialization() {
        return laccForSerializationLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AdornLibraryAccessors extends SubDependencyFactory {

        public AdornLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>maven.modrinth:adorn</b> coordinates and
         * with version <b>5.0.0-fabric</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("adorn.fabric");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>maven.modrinth:adorn</b> coordinates and
         * with version <b>5.0.0-forge</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("adorn.forge");
        }

    }

    public static class FabricLibraryAccessors extends SubDependencyFactory {

        public FabricLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>net.fabricmc.fabric-api:fabric-api</b> coordinates and
         * with version reference <b>fabric.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("fabric.api");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>net.fabricmc:fabric-language-kotlin</b> coordinates and
         * with version reference <b>fabric.kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("fabric.kotlin");
        }

        /**
         * Dependency provider for <b>loader</b> with <b>net.fabricmc:fabric-loader</b> coordinates and
         * with version reference <b>fabric.loader</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLoader() {
            return create("fabric.loader");
        }

        /**
         * Dependency provider for <b>permissions</b> with <b>me.lucko:fabric-permissions-api</b> coordinates and
         * with version reference <b>fabric.permissions.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPermissions() {
            return create("fabric.permissions");
        }

    }

    public static class IndraLibraryAccessors extends SubDependencyFactory {

        public IndraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>net.kyori:indra-common</b> coordinates and
         * with version reference <b>indra</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("indra.common");
        }

    }

    public static class JeiLibraryAccessors extends SubDependencyFactory {

        public JeiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>local.mezz.jei:common-api</b> coordinates and
         * with version reference <b>jei.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("jei.api");
        }

        /**
         * Dependency provider for <b>fabric</b> with <b>mezz.jei:jei-1.20.1-fabric</b> coordinates and
         * with version reference <b>jei.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("jei.fabric");
        }

    }

    public static class JetbrainsLibraryAccessors extends SubDependencyFactory {

        public JetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>org.jetbrains:annotations</b> coordinates and
         * with version reference <b>annotations</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            return create("jetbrains.annotations");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fabric</b> with <b>net.fabricmc:fabric-loader-junit</b> coordinates and
         * with version reference <b>fabric.loader</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFabric() {
            return create("junit.fabric");
        }

        /**
         * Dependency provider for <b>params</b> with <b>org.junit.jupiter:junit-jupiter-params</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getParams() {
            return create("junit.params");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.jetbrains.kotlin:kotlin-gradle-plugin</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("kotlin");
        }

        /**
         * Dependency provider for <b>forge</b> with <b>thedarkcolour:kotlinforforge</b> coordinates and
         * with version reference <b>kotlin.for.forge</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getForge() {
            return create("kotlin.forge");
        }

        /**
         * Dependency provider for <b>reflect</b> with <b>org.jetbrains.kotlin:kotlin-reflect</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReflect() {
            return create("kotlin.reflect");
        }

        /**
         * Dependency provider for <b>stdlib</b> with <b>org.jetbrains.kotlin:kotlin-stdlib-jdk8</b> coordinates and
         * with version reference <b>kotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getStdlib() {
            return create("kotlin.stdlib");
        }

    }

    public static class MockLibraryAccessors extends SubDependencyFactory {

        public MockLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>kotlin</b> with <b>io.mockk:mockk</b> coordinates and
         * with version reference <b>mockk</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("mock.kotlin");
        }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mockito:mockito-core</b> coordinates and
         * with version reference <b>mockito</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("mockito.core");
        }

    }

    public static class MongoLibraryAccessors extends SubDependencyFactory {
        private final MongoDriverLibraryAccessors laccForMongoDriverLibraryAccessors = new MongoDriverLibraryAccessors(owner);

        public MongoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>mongo.driver</b>
         */
        public MongoDriverLibraryAccessors getDriver() {
            return laccForMongoDriverLibraryAccessors;
        }

    }

    public static class MongoDriverLibraryAccessors extends SubDependencyFactory {

        public MongoDriverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mongodb:mongodb-driver-core</b> coordinates and
         * with version reference <b>mongo</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("mongo.driver.core");
        }

        /**
         * Dependency provider for <b>sync</b> with <b>org.mongodb:mongodb-driver-sync</b> coordinates and
         * with version reference <b>mongo</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSync() {
            return create("mongo.driver.sync");
        }

    }

    public static class SerializationLibraryAccessors extends SubDependencyFactory {

        public SerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jetbrains.kotlinx:kotlinx-serialization-core-jvm</b> coordinates and
         * with version reference <b>serialization</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("serialization.core");
        }

        /**
         * Dependency provider for <b>json</b> with <b>org.jetbrains.kotlinx:kotlinx-serialization-json-jvm</b> coordinates and
         * with version reference <b>serialization</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJson() {
            return create("serialization.json");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ArchitecturyVersionAccessors vaccForArchitecturyVersionAccessors = new ArchitecturyVersionAccessors(providers, config);
        private final FabricVersionAccessors vaccForFabricVersionAccessors = new FabricVersionAccessors(providers, config);
        private final IdeaVersionAccessors vaccForIdeaVersionAccessors = new IdeaVersionAccessors(providers, config);
        private final JeiVersionAccessors vaccForJeiVersionAccessors = new JeiVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>annotations</b> with value <b>23.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAnnotations() { return getVersion("annotations"); }

        /**
         * Version alias <b>blossom</b> with value <b>2.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getBlossom() { return getVersion("blossom"); }

        /**
         * Version alias <b>classgraph</b> with value <b>4.8.153</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getClassgraph() { return getVersion("classgraph"); }

        /**
         * Version alias <b>flywheel</b> with value <b>0.6.10-7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFlywheel() { return getVersion("flywheel"); }

        /**
         * Version alias <b>forge</b> with value <b>1.20.1-47.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getForge() { return getVersion("forge"); }

        /**
         * Version alias <b>graal</b> with value <b>22.3.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGraal() { return getVersion("graal"); }

        /**
         * Version alias <b>icu4j</b> with value <b>71.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getIcu4j() { return getVersion("icu4j"); }

        /**
         * Version alias <b>indra</b> with value <b>3.1.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getIndra() { return getVersion("indra"); }

        /**
         * Version alias <b>junit</b> with value <b>5.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>lambDynamicLights</b> with value <b>2.3.2+1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLambDynamicLights() { return getVersion("lambDynamicLights"); }

        /**
         * Version alias <b>licenser</b> with value <b>0.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLicenser() { return getVersion("licenser"); }

        /**
         * Version alias <b>loom</b> with value <b>1.11.458</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLoom() { return getVersion("loom"); }

        /**
         * Version alias <b>mockito</b> with value <b>5.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockito() { return getVersion("mockito"); }

        /**
         * Version alias <b>mockk</b> with value <b>1.12.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockk() { return getVersion("mockk"); }

        /**
         * Version alias <b>molang</b> with value <b>1.1.11</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMolang() { return getVersion("molang"); }

        /**
         * Version alias <b>mongo</b> with value <b>4.10.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMongo() { return getVersion("mongo"); }

        /**
         * Version alias <b>serialization</b> with value <b>1.6.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSerialization() { return getVersion("serialization"); }

        /**
         * Version alias <b>shadow</b> with value <b>8.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getShadow() { return getVersion("shadow"); }

        /**
         * Group of versions at <b>versions.architectury</b>
         */
        public ArchitecturyVersionAccessors getArchitectury() {
            return vaccForArchitecturyVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.fabric</b>
         */
        public FabricVersionAccessors getFabric() {
            return vaccForFabricVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.idea</b>
         */
        public IdeaVersionAccessors getIdea() {
            return vaccForIdeaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jei</b>
         */
        public JeiVersionAccessors getJei() {
            return vaccForJeiVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.kotlin</b>
         */
        public KotlinVersionAccessors getKotlin() {
            return vaccForKotlinVersionAccessors;
        }

    }

    public static class ArchitecturyVersionAccessors extends VersionFactory  {

        public ArchitecturyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>architectury.plugin</b> with value <b>3.4.164</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPlugin() { return getVersion("architectury.plugin"); }

    }

    public static class FabricVersionAccessors extends VersionFactory  {

        private final FabricPermissionsVersionAccessors vaccForFabricPermissionsVersionAccessors = new FabricPermissionsVersionAccessors(providers, config);
        public FabricVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabric.api</b> with value <b>0.89.0+1.20.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("fabric.api"); }

        /**
         * Version alias <b>fabric.kotlin</b> with value <b>1.9.3+kotlin.1.8.20</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("fabric.kotlin"); }

        /**
         * Version alias <b>fabric.loader</b> with value <b>0.15.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLoader() { return getVersion("fabric.loader"); }

        /**
         * Group of versions at <b>versions.fabric.permissions</b>
         */
        public FabricPermissionsVersionAccessors getPermissions() {
            return vaccForFabricPermissionsVersionAccessors;
        }

    }

    public static class FabricPermissionsVersionAccessors extends VersionFactory  {

        public FabricPermissionsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>fabric.permissions.api</b> with value <b>0.2-SNAPSHOT</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("fabric.permissions.api"); }

    }

    public static class IdeaVersionAccessors extends VersionFactory  {

        public IdeaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>idea.ext</b> with value <b>1.1.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getExt() { return getVersion("idea.ext"); }

    }

    public static class JeiVersionAccessors extends VersionFactory  {

        public JeiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jei.api</b> with value <b>15.2.0.25</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jei.api"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final KotlinForVersionAccessors vaccForKotlinForVersionAccessors = new KotlinForVersionAccessors(providers, config);
        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin</b> with value <b>1.9.22</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("kotlin"); }

        /**
         * Group of versions at <b>versions.kotlin.for</b>
         */
        public KotlinForVersionAccessors getFor() {
            return vaccForKotlinForVersionAccessors;
        }

    }

    public static class KotlinForVersionAccessors extends VersionFactory  {

        public KotlinForVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin.for.forge</b> with value <b>4.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getForge() { return getVersion("kotlin.for.forge"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final FabricBundleAccessors baccForFabricBundleAccessors = new FabricBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>kotlin</b> which contains the following dependencies:
         * <ul>
         *    <li>org.jetbrains.kotlin:kotlin-stdlib-jdk8</li>
         *    <li>org.jetbrains.kotlin:kotlin-reflect</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getKotlin() {
            return createBundle("kotlin");
        }

        /**
         * Dependency bundle provider for <b>mongo</b> which contains the following dependencies:
         * <ul>
         *    <li>org.mongodb:mongodb-driver-core</li>
         *    <li>org.mongodb:mongodb-driver-sync</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getMongo() {
            return createBundle("mongo");
        }

        /**
         * Dependency bundle provider for <b>unitTesting</b> which contains the following dependencies:
         * <ul>
         *    <li>net.fabricmc:fabric-loader-junit</li>
         *    <li>org.junit.jupiter:junit-jupiter-params</li>
         *    <li>org.mockito:mockito-core</li>
         *    <li>io.mockk:mockk</li>
         *    <li>io.github.classgraph:classgraph</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getUnitTesting() {
            return createBundle("unitTesting");
        }

        /**
         * Group of bundles at <b>bundles.fabric</b>
         */
        public FabricBundleAccessors getFabric() {
            return baccForFabricBundleAccessors;
        }

    }

    public static class FabricBundleAccessors extends BundleFactory  implements BundleNotationSupplier{
        private final FabricIntegrationsBundleAccessors baccForFabricIntegrationsBundleAccessors = new FabricIntegrationsBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final FabricKotlinBundleAccessors baccForFabricKotlinBundleAccessors = new FabricKotlinBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public FabricBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>fabric</b> which contains the following dependencies:
         * <ul>
         *    <li>net.fabricmc:fabric-language-kotlin</li>
         *    <li>me.lucko:fabric-permissions-api</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> asProvider() {
            return createBundle("fabric");
        }

        /**
         * Group of bundles at <b>bundles.fabric.integrations</b>
         */
        public FabricIntegrationsBundleAccessors getIntegrations() {
            return baccForFabricIntegrationsBundleAccessors;
        }

        /**
         * Group of bundles at <b>bundles.fabric.kotlin</b>
         */
        public FabricKotlinBundleAccessors getKotlin() {
            return baccForFabricKotlinBundleAccessors;
        }

    }

    public static class FabricIntegrationsBundleAccessors extends BundleFactory {

        public FabricIntegrationsBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>fabric.integrations.compileOnly</b> which contains the following dependencies:
         * <ul>
         *    <li>maven.modrinth:adorn</li>
         *    <li>maven.modrinth:lambdynamiclights</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getCompileOnly() {
            return createBundle("fabric.integrations.compileOnly");
        }

        /**
         * Dependency bundle provider for <b>fabric.integrations.runtimeOnly</b> which contains the following dependencies:
         * <ul>
         *    <li>mezz.jei:jei-1.20.1-fabric</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getRuntimeOnly() {
            return createBundle("fabric.integrations.runtimeOnly");
        }

    }

    public static class FabricKotlinBundleAccessors extends BundleFactory {

        public FabricKotlinBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>fabric.kotlin.deps</b> which contains the following dependencies:
         * <ul>
         *    <li>org.jetbrains:annotations</li>
         *    <li>org.jetbrains.kotlinx:kotlinx-serialization-core-jvm</li>
         *    <li>org.jetbrains.kotlinx:kotlinx-serialization-json-jvm</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getDeps() {
            return createBundle("fabric.kotlin.deps");
        }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
