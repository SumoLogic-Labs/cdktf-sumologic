package com.sumologic.local_file_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.066Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.localFileSource.LocalFileSourceConfig")
@software.amazon.jsii.Jsii.Proxy(LocalFileSourceConfig.Jsii$Proxy.class)
public interface LocalFileSourceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#collector_id LocalFileSource#collector_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCollectorId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#name LocalFileSource#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#path_expression LocalFileSource#path_expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPathExpression();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#automatic_date_parsing LocalFileSource#automatic_date_parsing}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutomaticDateParsing() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#category LocalFileSource#category}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCategory() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#content_type LocalFileSource#content_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContentType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#cutoff_relative_time LocalFileSource#cutoff_relative_time}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCutoffRelativeTime() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#cutoff_timestamp LocalFileSource#cutoff_timestamp}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCutoffTimestamp() {
        return null;
    }

    /**
     * default_date_formats block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#default_date_formats LocalFileSource#default_date_formats}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDefaultDateFormats() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#deny_list LocalFileSource#deny_list}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDenyList() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#description LocalFileSource#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#encoding LocalFileSource#encoding}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEncoding() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#fields LocalFileSource#fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFields() {
        return null;
    }

    /**
     * filters block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#filters LocalFileSource#filters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFilters() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#force_timezone LocalFileSource#force_timezone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceTimezone() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#host_name LocalFileSource#host_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#id LocalFileSource#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#manual_prefix_regexp LocalFileSource#manual_prefix_regexp}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManualPrefixRegexp() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#multiline_processing_enabled LocalFileSource#multiline_processing_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMultilineProcessingEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#timezone LocalFileSource#timezone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimezone() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#use_autoline_matching LocalFileSource#use_autoline_matching}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseAutolineMatching() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LocalFileSourceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LocalFileSourceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LocalFileSourceConfig> {
        java.lang.Number collectorId;
        java.lang.String name;
        java.lang.String pathExpression;
        java.lang.Object automaticDateParsing;
        java.lang.String category;
        java.lang.String contentType;
        java.lang.String cutoffRelativeTime;
        java.lang.Number cutoffTimestamp;
        java.lang.Object defaultDateFormats;
        java.util.List<java.lang.String> denyList;
        java.lang.String description;
        java.lang.String encoding;
        java.util.Map<java.lang.String, java.lang.String> fields;
        java.lang.Object filters;
        java.lang.Object forceTimezone;
        java.lang.String hostName;
        java.lang.String id;
        java.lang.String manualPrefixRegexp;
        java.lang.Object multilineProcessingEnabled;
        java.lang.String timezone;
        java.lang.Object useAutolineMatching;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCollectorId}
         * @param collectorId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#collector_id LocalFileSource#collector_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder collectorId(java.lang.Number collectorId) {
            this.collectorId = collectorId;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#name LocalFileSource#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getPathExpression}
         * @param pathExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#path_expression LocalFileSource#path_expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder pathExpression(java.lang.String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getAutomaticDateParsing}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#automatic_date_parsing LocalFileSource#automatic_date_parsing}.
         * @return {@code this}
         */
        public Builder automaticDateParsing(java.lang.Boolean automaticDateParsing) {
            this.automaticDateParsing = automaticDateParsing;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getAutomaticDateParsing}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#automatic_date_parsing LocalFileSource#automatic_date_parsing}.
         * @return {@code this}
         */
        public Builder automaticDateParsing(com.hashicorp.cdktf.IResolvable automaticDateParsing) {
            this.automaticDateParsing = automaticDateParsing;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCategory}
         * @param category Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#category LocalFileSource#category}.
         * @return {@code this}
         */
        public Builder category(java.lang.String category) {
            this.category = category;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#content_type LocalFileSource#content_type}.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCutoffRelativeTime}
         * @param cutoffRelativeTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#cutoff_relative_time LocalFileSource#cutoff_relative_time}.
         * @return {@code this}
         */
        public Builder cutoffRelativeTime(java.lang.String cutoffRelativeTime) {
            this.cutoffRelativeTime = cutoffRelativeTime;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCutoffTimestamp}
         * @param cutoffTimestamp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#cutoff_timestamp LocalFileSource#cutoff_timestamp}.
         * @return {@code this}
         */
        public Builder cutoffTimestamp(java.lang.Number cutoffTimestamp) {
            this.cutoffTimestamp = cutoffTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getDefaultDateFormats}
         * @param defaultDateFormats default_date_formats block.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#default_date_formats LocalFileSource#default_date_formats}
         * @return {@code this}
         */
        public Builder defaultDateFormats(com.hashicorp.cdktf.IResolvable defaultDateFormats) {
            this.defaultDateFormats = defaultDateFormats;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getDefaultDateFormats}
         * @param defaultDateFormats default_date_formats block.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#default_date_formats LocalFileSource#default_date_formats}
         * @return {@code this}
         */
        public Builder defaultDateFormats(java.util.List<? extends com.sumologic.local_file_source.LocalFileSourceDefaultDateFormats> defaultDateFormats) {
            this.defaultDateFormats = defaultDateFormats;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getDenyList}
         * @param denyList Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#deny_list LocalFileSource#deny_list}.
         * @return {@code this}
         */
        public Builder denyList(java.util.List<java.lang.String> denyList) {
            this.denyList = denyList;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#description LocalFileSource#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getEncoding}
         * @param encoding Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#encoding LocalFileSource#encoding}.
         * @return {@code this}
         */
        public Builder encoding(java.lang.String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getFields}
         * @param fields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#fields LocalFileSource#fields}.
         * @return {@code this}
         */
        public Builder fields(java.util.Map<java.lang.String, java.lang.String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getFilters}
         * @param filters filters block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#filters LocalFileSource#filters}
         * @return {@code this}
         */
        public Builder filters(com.hashicorp.cdktf.IResolvable filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getFilters}
         * @param filters filters block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#filters LocalFileSource#filters}
         * @return {@code this}
         */
        public Builder filters(java.util.List<? extends com.sumologic.local_file_source.LocalFileSourceFilters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getForceTimezone}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#force_timezone LocalFileSource#force_timezone}.
         * @return {@code this}
         */
        public Builder forceTimezone(java.lang.Boolean forceTimezone) {
            this.forceTimezone = forceTimezone;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getForceTimezone}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#force_timezone LocalFileSource#force_timezone}.
         * @return {@code this}
         */
        public Builder forceTimezone(com.hashicorp.cdktf.IResolvable forceTimezone) {
            this.forceTimezone = forceTimezone;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getHostName}
         * @param hostName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#host_name LocalFileSource#host_name}.
         * @return {@code this}
         */
        public Builder hostName(java.lang.String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#id LocalFileSource#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getManualPrefixRegexp}
         * @param manualPrefixRegexp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#manual_prefix_regexp LocalFileSource#manual_prefix_regexp}.
         * @return {@code this}
         */
        public Builder manualPrefixRegexp(java.lang.String manualPrefixRegexp) {
            this.manualPrefixRegexp = manualPrefixRegexp;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getMultilineProcessingEnabled}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#multiline_processing_enabled LocalFileSource#multiline_processing_enabled}.
         * @return {@code this}
         */
        public Builder multilineProcessingEnabled(java.lang.Boolean multilineProcessingEnabled) {
            this.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getMultilineProcessingEnabled}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#multiline_processing_enabled LocalFileSource#multiline_processing_enabled}.
         * @return {@code this}
         */
        public Builder multilineProcessingEnabled(com.hashicorp.cdktf.IResolvable multilineProcessingEnabled) {
            this.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getTimezone}
         * @param timezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#timezone LocalFileSource#timezone}.
         * @return {@code this}
         */
        public Builder timezone(java.lang.String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getUseAutolineMatching}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#use_autoline_matching LocalFileSource#use_autoline_matching}.
         * @return {@code this}
         */
        public Builder useAutolineMatching(java.lang.Boolean useAutolineMatching) {
            this.useAutolineMatching = useAutolineMatching;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getUseAutolineMatching}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/local_file_source#use_autoline_matching LocalFileSource#use_autoline_matching}.
         * @return {@code this}
         */
        public Builder useAutolineMatching(com.hashicorp.cdktf.IResolvable useAutolineMatching) {
            this.useAutolineMatching = useAutolineMatching;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link LocalFileSourceConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LocalFileSourceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LocalFileSourceConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LocalFileSourceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LocalFileSourceConfig {
        private final java.lang.Number collectorId;
        private final java.lang.String name;
        private final java.lang.String pathExpression;
        private final java.lang.Object automaticDateParsing;
        private final java.lang.String category;
        private final java.lang.String contentType;
        private final java.lang.String cutoffRelativeTime;
        private final java.lang.Number cutoffTimestamp;
        private final java.lang.Object defaultDateFormats;
        private final java.util.List<java.lang.String> denyList;
        private final java.lang.String description;
        private final java.lang.String encoding;
        private final java.util.Map<java.lang.String, java.lang.String> fields;
        private final java.lang.Object filters;
        private final java.lang.Object forceTimezone;
        private final java.lang.String hostName;
        private final java.lang.String id;
        private final java.lang.String manualPrefixRegexp;
        private final java.lang.Object multilineProcessingEnabled;
        private final java.lang.String timezone;
        private final java.lang.Object useAutolineMatching;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.collectorId = software.amazon.jsii.Kernel.get(this, "collectorId", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pathExpression = software.amazon.jsii.Kernel.get(this, "pathExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.automaticDateParsing = software.amazon.jsii.Kernel.get(this, "automaticDateParsing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.category = software.amazon.jsii.Kernel.get(this, "category", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cutoffRelativeTime = software.amazon.jsii.Kernel.get(this, "cutoffRelativeTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cutoffTimestamp = software.amazon.jsii.Kernel.get(this, "cutoffTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.defaultDateFormats = software.amazon.jsii.Kernel.get(this, "defaultDateFormats", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.denyList = software.amazon.jsii.Kernel.get(this, "denyList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.encoding = software.amazon.jsii.Kernel.get(this, "encoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.filters = software.amazon.jsii.Kernel.get(this, "filters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.forceTimezone = software.amazon.jsii.Kernel.get(this, "forceTimezone", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostName = software.amazon.jsii.Kernel.get(this, "hostName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.manualPrefixRegexp = software.amazon.jsii.Kernel.get(this, "manualPrefixRegexp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.multilineProcessingEnabled = software.amazon.jsii.Kernel.get(this, "multilineProcessingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timezone = software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useAutolineMatching = software.amazon.jsii.Kernel.get(this, "useAutolineMatching", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.collectorId = java.util.Objects.requireNonNull(builder.collectorId, "collectorId is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.pathExpression = java.util.Objects.requireNonNull(builder.pathExpression, "pathExpression is required");
            this.automaticDateParsing = builder.automaticDateParsing;
            this.category = builder.category;
            this.contentType = builder.contentType;
            this.cutoffRelativeTime = builder.cutoffRelativeTime;
            this.cutoffTimestamp = builder.cutoffTimestamp;
            this.defaultDateFormats = builder.defaultDateFormats;
            this.denyList = builder.denyList;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.fields = builder.fields;
            this.filters = builder.filters;
            this.forceTimezone = builder.forceTimezone;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.manualPrefixRegexp = builder.manualPrefixRegexp;
            this.multilineProcessingEnabled = builder.multilineProcessingEnabled;
            this.timezone = builder.timezone;
            this.useAutolineMatching = builder.useAutolineMatching;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Number getCollectorId() {
            return this.collectorId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPathExpression() {
            return this.pathExpression;
        }

        @Override
        public final java.lang.Object getAutomaticDateParsing() {
            return this.automaticDateParsing;
        }

        @Override
        public final java.lang.String getCategory() {
            return this.category;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getCutoffRelativeTime() {
            return this.cutoffRelativeTime;
        }

        @Override
        public final java.lang.Number getCutoffTimestamp() {
            return this.cutoffTimestamp;
        }

        @Override
        public final java.lang.Object getDefaultDateFormats() {
            return this.defaultDateFormats;
        }

        @Override
        public final java.util.List<java.lang.String> getDenyList() {
            return this.denyList;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getEncoding() {
            return this.encoding;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getFields() {
            return this.fields;
        }

        @Override
        public final java.lang.Object getFilters() {
            return this.filters;
        }

        @Override
        public final java.lang.Object getForceTimezone() {
            return this.forceTimezone;
        }

        @Override
        public final java.lang.String getHostName() {
            return this.hostName;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getManualPrefixRegexp() {
            return this.manualPrefixRegexp;
        }

        @Override
        public final java.lang.Object getMultilineProcessingEnabled() {
            return this.multilineProcessingEnabled;
        }

        @Override
        public final java.lang.String getTimezone() {
            return this.timezone;
        }

        @Override
        public final java.lang.Object getUseAutolineMatching() {
            return this.useAutolineMatching;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("collectorId", om.valueToTree(this.getCollectorId()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("pathExpression", om.valueToTree(this.getPathExpression()));
            if (this.getAutomaticDateParsing() != null) {
                data.set("automaticDateParsing", om.valueToTree(this.getAutomaticDateParsing()));
            }
            if (this.getCategory() != null) {
                data.set("category", om.valueToTree(this.getCategory()));
            }
            if (this.getContentType() != null) {
                data.set("contentType", om.valueToTree(this.getContentType()));
            }
            if (this.getCutoffRelativeTime() != null) {
                data.set("cutoffRelativeTime", om.valueToTree(this.getCutoffRelativeTime()));
            }
            if (this.getCutoffTimestamp() != null) {
                data.set("cutoffTimestamp", om.valueToTree(this.getCutoffTimestamp()));
            }
            if (this.getDefaultDateFormats() != null) {
                data.set("defaultDateFormats", om.valueToTree(this.getDefaultDateFormats()));
            }
            if (this.getDenyList() != null) {
                data.set("denyList", om.valueToTree(this.getDenyList()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEncoding() != null) {
                data.set("encoding", om.valueToTree(this.getEncoding()));
            }
            if (this.getFields() != null) {
                data.set("fields", om.valueToTree(this.getFields()));
            }
            if (this.getFilters() != null) {
                data.set("filters", om.valueToTree(this.getFilters()));
            }
            if (this.getForceTimezone() != null) {
                data.set("forceTimezone", om.valueToTree(this.getForceTimezone()));
            }
            if (this.getHostName() != null) {
                data.set("hostName", om.valueToTree(this.getHostName()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getManualPrefixRegexp() != null) {
                data.set("manualPrefixRegexp", om.valueToTree(this.getManualPrefixRegexp()));
            }
            if (this.getMultilineProcessingEnabled() != null) {
                data.set("multilineProcessingEnabled", om.valueToTree(this.getMultilineProcessingEnabled()));
            }
            if (this.getTimezone() != null) {
                data.set("timezone", om.valueToTree(this.getTimezone()));
            }
            if (this.getUseAutolineMatching() != null) {
                data.set("useAutolineMatching", om.valueToTree(this.getUseAutolineMatching()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.localFileSource.LocalFileSourceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LocalFileSourceConfig.Jsii$Proxy that = (LocalFileSourceConfig.Jsii$Proxy) o;

            if (!collectorId.equals(that.collectorId)) return false;
            if (!name.equals(that.name)) return false;
            if (!pathExpression.equals(that.pathExpression)) return false;
            if (this.automaticDateParsing != null ? !this.automaticDateParsing.equals(that.automaticDateParsing) : that.automaticDateParsing != null) return false;
            if (this.category != null ? !this.category.equals(that.category) : that.category != null) return false;
            if (this.contentType != null ? !this.contentType.equals(that.contentType) : that.contentType != null) return false;
            if (this.cutoffRelativeTime != null ? !this.cutoffRelativeTime.equals(that.cutoffRelativeTime) : that.cutoffRelativeTime != null) return false;
            if (this.cutoffTimestamp != null ? !this.cutoffTimestamp.equals(that.cutoffTimestamp) : that.cutoffTimestamp != null) return false;
            if (this.defaultDateFormats != null ? !this.defaultDateFormats.equals(that.defaultDateFormats) : that.defaultDateFormats != null) return false;
            if (this.denyList != null ? !this.denyList.equals(that.denyList) : that.denyList != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.encoding != null ? !this.encoding.equals(that.encoding) : that.encoding != null) return false;
            if (this.fields != null ? !this.fields.equals(that.fields) : that.fields != null) return false;
            if (this.filters != null ? !this.filters.equals(that.filters) : that.filters != null) return false;
            if (this.forceTimezone != null ? !this.forceTimezone.equals(that.forceTimezone) : that.forceTimezone != null) return false;
            if (this.hostName != null ? !this.hostName.equals(that.hostName) : that.hostName != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.manualPrefixRegexp != null ? !this.manualPrefixRegexp.equals(that.manualPrefixRegexp) : that.manualPrefixRegexp != null) return false;
            if (this.multilineProcessingEnabled != null ? !this.multilineProcessingEnabled.equals(that.multilineProcessingEnabled) : that.multilineProcessingEnabled != null) return false;
            if (this.timezone != null ? !this.timezone.equals(that.timezone) : that.timezone != null) return false;
            if (this.useAutolineMatching != null ? !this.useAutolineMatching.equals(that.useAutolineMatching) : that.useAutolineMatching != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.collectorId.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.pathExpression.hashCode());
            result = 31 * result + (this.automaticDateParsing != null ? this.automaticDateParsing.hashCode() : 0);
            result = 31 * result + (this.category != null ? this.category.hashCode() : 0);
            result = 31 * result + (this.contentType != null ? this.contentType.hashCode() : 0);
            result = 31 * result + (this.cutoffRelativeTime != null ? this.cutoffRelativeTime.hashCode() : 0);
            result = 31 * result + (this.cutoffTimestamp != null ? this.cutoffTimestamp.hashCode() : 0);
            result = 31 * result + (this.defaultDateFormats != null ? this.defaultDateFormats.hashCode() : 0);
            result = 31 * result + (this.denyList != null ? this.denyList.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.encoding != null ? this.encoding.hashCode() : 0);
            result = 31 * result + (this.fields != null ? this.fields.hashCode() : 0);
            result = 31 * result + (this.filters != null ? this.filters.hashCode() : 0);
            result = 31 * result + (this.forceTimezone != null ? this.forceTimezone.hashCode() : 0);
            result = 31 * result + (this.hostName != null ? this.hostName.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.manualPrefixRegexp != null ? this.manualPrefixRegexp.hashCode() : 0);
            result = 31 * result + (this.multilineProcessingEnabled != null ? this.multilineProcessingEnabled.hashCode() : 0);
            result = 31 * result + (this.timezone != null ? this.timezone.hashCode() : 0);
            result = 31 * result + (this.useAutolineMatching != null ? this.useAutolineMatching.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
