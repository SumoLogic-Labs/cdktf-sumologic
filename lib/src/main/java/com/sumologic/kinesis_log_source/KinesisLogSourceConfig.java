package com.sumologic.kinesis_log_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.056Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.kinesisLogSource.KinesisLogSourceConfig")
@software.amazon.jsii.Jsii.Proxy(KinesisLogSourceConfig.Jsii$Proxy.class)
public interface KinesisLogSourceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#collector_id KinesisLogSource#collector_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCollectorId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#content_type KinesisLogSource#content_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContentType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#name KinesisLogSource#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * authentication block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#authentication KinesisLogSource#authentication}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication getAuthentication() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#automatic_date_parsing KinesisLogSource#automatic_date_parsing}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAutomaticDateParsing() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#category KinesisLogSource#category}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCategory() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#cutoff_relative_time KinesisLogSource#cutoff_relative_time}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCutoffRelativeTime() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#cutoff_timestamp KinesisLogSource#cutoff_timestamp}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCutoffTimestamp() {
        return null;
    }

    /**
     * default_date_formats block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#default_date_formats KinesisLogSource#default_date_formats}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDefaultDateFormats() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#description KinesisLogSource#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#fields KinesisLogSource#fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFields() {
        return null;
    }

    /**
     * filters block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#filters KinesisLogSource#filters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFilters() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#force_timezone KinesisLogSource#force_timezone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceTimezone() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#host_name KinesisLogSource#host_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#id KinesisLogSource#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#manual_prefix_regexp KinesisLogSource#manual_prefix_regexp}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManualPrefixRegexp() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#message_per_request KinesisLogSource#message_per_request}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMessagePerRequest() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#multiline_processing_enabled KinesisLogSource#multiline_processing_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMultilineProcessingEnabled() {
        return null;
    }

    /**
     * path block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#path KinesisLogSource#path}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.kinesis_log_source.KinesisLogSourcePath getPath() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#timezone KinesisLogSource#timezone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimezone() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#use_autoline_matching KinesisLogSource#use_autoline_matching}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseAutolineMatching() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisLogSourceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisLogSourceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisLogSourceConfig> {
        java.lang.Number collectorId;
        java.lang.String contentType;
        java.lang.String name;
        com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication authentication;
        java.lang.Object automaticDateParsing;
        java.lang.String category;
        java.lang.String cutoffRelativeTime;
        java.lang.Number cutoffTimestamp;
        java.lang.Object defaultDateFormats;
        java.lang.String description;
        java.util.Map<java.lang.String, java.lang.String> fields;
        java.lang.Object filters;
        java.lang.Object forceTimezone;
        java.lang.String hostName;
        java.lang.String id;
        java.lang.String manualPrefixRegexp;
        java.lang.Object messagePerRequest;
        java.lang.Object multilineProcessingEnabled;
        com.sumologic.kinesis_log_source.KinesisLogSourcePath path;
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
         * Sets the value of {@link KinesisLogSourceConfig#getCollectorId}
         * @param collectorId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#collector_id KinesisLogSource#collector_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder collectorId(java.lang.Number collectorId) {
            this.collectorId = collectorId;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#content_type KinesisLogSource#content_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#name KinesisLogSource#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getAuthentication}
         * @param authentication authentication block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#authentication KinesisLogSource#authentication}
         * @return {@code this}
         */
        public Builder authentication(com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getAutomaticDateParsing}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#automatic_date_parsing KinesisLogSource#automatic_date_parsing}.
         * @return {@code this}
         */
        public Builder automaticDateParsing(java.lang.Boolean automaticDateParsing) {
            this.automaticDateParsing = automaticDateParsing;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getAutomaticDateParsing}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#automatic_date_parsing KinesisLogSource#automatic_date_parsing}.
         * @return {@code this}
         */
        public Builder automaticDateParsing(com.hashicorp.cdktf.IResolvable automaticDateParsing) {
            this.automaticDateParsing = automaticDateParsing;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getCategory}
         * @param category Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#category KinesisLogSource#category}.
         * @return {@code this}
         */
        public Builder category(java.lang.String category) {
            this.category = category;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getCutoffRelativeTime}
         * @param cutoffRelativeTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#cutoff_relative_time KinesisLogSource#cutoff_relative_time}.
         * @return {@code this}
         */
        public Builder cutoffRelativeTime(java.lang.String cutoffRelativeTime) {
            this.cutoffRelativeTime = cutoffRelativeTime;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getCutoffTimestamp}
         * @param cutoffTimestamp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#cutoff_timestamp KinesisLogSource#cutoff_timestamp}.
         * @return {@code this}
         */
        public Builder cutoffTimestamp(java.lang.Number cutoffTimestamp) {
            this.cutoffTimestamp = cutoffTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getDefaultDateFormats}
         * @param defaultDateFormats default_date_formats block.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#default_date_formats KinesisLogSource#default_date_formats}
         * @return {@code this}
         */
        public Builder defaultDateFormats(com.hashicorp.cdktf.IResolvable defaultDateFormats) {
            this.defaultDateFormats = defaultDateFormats;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getDefaultDateFormats}
         * @param defaultDateFormats default_date_formats block.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#default_date_formats KinesisLogSource#default_date_formats}
         * @return {@code this}
         */
        public Builder defaultDateFormats(java.util.List<? extends com.sumologic.kinesis_log_source.KinesisLogSourceDefaultDateFormats> defaultDateFormats) {
            this.defaultDateFormats = defaultDateFormats;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#description KinesisLogSource#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getFields}
         * @param fields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#fields KinesisLogSource#fields}.
         * @return {@code this}
         */
        public Builder fields(java.util.Map<java.lang.String, java.lang.String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getFilters}
         * @param filters filters block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#filters KinesisLogSource#filters}
         * @return {@code this}
         */
        public Builder filters(com.hashicorp.cdktf.IResolvable filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getFilters}
         * @param filters filters block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#filters KinesisLogSource#filters}
         * @return {@code this}
         */
        public Builder filters(java.util.List<? extends com.sumologic.kinesis_log_source.KinesisLogSourceFilters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getForceTimezone}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#force_timezone KinesisLogSource#force_timezone}.
         * @return {@code this}
         */
        public Builder forceTimezone(java.lang.Boolean forceTimezone) {
            this.forceTimezone = forceTimezone;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getForceTimezone}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#force_timezone KinesisLogSource#force_timezone}.
         * @return {@code this}
         */
        public Builder forceTimezone(com.hashicorp.cdktf.IResolvable forceTimezone) {
            this.forceTimezone = forceTimezone;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getHostName}
         * @param hostName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#host_name KinesisLogSource#host_name}.
         * @return {@code this}
         */
        public Builder hostName(java.lang.String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#id KinesisLogSource#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getManualPrefixRegexp}
         * @param manualPrefixRegexp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#manual_prefix_regexp KinesisLogSource#manual_prefix_regexp}.
         * @return {@code this}
         */
        public Builder manualPrefixRegexp(java.lang.String manualPrefixRegexp) {
            this.manualPrefixRegexp = manualPrefixRegexp;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getMessagePerRequest}
         * @param messagePerRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#message_per_request KinesisLogSource#message_per_request}.
         * @return {@code this}
         */
        public Builder messagePerRequest(java.lang.Boolean messagePerRequest) {
            this.messagePerRequest = messagePerRequest;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getMessagePerRequest}
         * @param messagePerRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#message_per_request KinesisLogSource#message_per_request}.
         * @return {@code this}
         */
        public Builder messagePerRequest(com.hashicorp.cdktf.IResolvable messagePerRequest) {
            this.messagePerRequest = messagePerRequest;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getMultilineProcessingEnabled}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#multiline_processing_enabled KinesisLogSource#multiline_processing_enabled}.
         * @return {@code this}
         */
        public Builder multilineProcessingEnabled(java.lang.Boolean multilineProcessingEnabled) {
            this.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getMultilineProcessingEnabled}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#multiline_processing_enabled KinesisLogSource#multiline_processing_enabled}.
         * @return {@code this}
         */
        public Builder multilineProcessingEnabled(com.hashicorp.cdktf.IResolvable multilineProcessingEnabled) {
            this.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getPath}
         * @param path path block.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#path KinesisLogSource#path}
         * @return {@code this}
         */
        public Builder path(com.sumologic.kinesis_log_source.KinesisLogSourcePath path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getTimezone}
         * @param timezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#timezone KinesisLogSource#timezone}.
         * @return {@code this}
         */
        public Builder timezone(java.lang.String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getUseAutolineMatching}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#use_autoline_matching KinesisLogSource#use_autoline_matching}.
         * @return {@code this}
         */
        public Builder useAutolineMatching(java.lang.Boolean useAutolineMatching) {
            this.useAutolineMatching = useAutolineMatching;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getUseAutolineMatching}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#use_autoline_matching KinesisLogSource#use_autoline_matching}.
         * @return {@code this}
         */
        public Builder useAutolineMatching(com.hashicorp.cdktf.IResolvable useAutolineMatching) {
            this.useAutolineMatching = useAutolineMatching;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getDependsOn}
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
         * Sets the value of {@link KinesisLogSourceConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourceConfig#getProvisioners}
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
         * @return a new instance of {@link KinesisLogSourceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisLogSourceConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisLogSourceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisLogSourceConfig {
        private final java.lang.Number collectorId;
        private final java.lang.String contentType;
        private final java.lang.String name;
        private final com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication authentication;
        private final java.lang.Object automaticDateParsing;
        private final java.lang.String category;
        private final java.lang.String cutoffRelativeTime;
        private final java.lang.Number cutoffTimestamp;
        private final java.lang.Object defaultDateFormats;
        private final java.lang.String description;
        private final java.util.Map<java.lang.String, java.lang.String> fields;
        private final java.lang.Object filters;
        private final java.lang.Object forceTimezone;
        private final java.lang.String hostName;
        private final java.lang.String id;
        private final java.lang.String manualPrefixRegexp;
        private final java.lang.Object messagePerRequest;
        private final java.lang.Object multilineProcessingEnabled;
        private final com.sumologic.kinesis_log_source.KinesisLogSourcePath path;
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
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authentication = software.amazon.jsii.Kernel.get(this, "authentication", software.amazon.jsii.NativeType.forClass(com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication.class));
            this.automaticDateParsing = software.amazon.jsii.Kernel.get(this, "automaticDateParsing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.category = software.amazon.jsii.Kernel.get(this, "category", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cutoffRelativeTime = software.amazon.jsii.Kernel.get(this, "cutoffRelativeTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cutoffTimestamp = software.amazon.jsii.Kernel.get(this, "cutoffTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.defaultDateFormats = software.amazon.jsii.Kernel.get(this, "defaultDateFormats", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.filters = software.amazon.jsii.Kernel.get(this, "filters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.forceTimezone = software.amazon.jsii.Kernel.get(this, "forceTimezone", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.hostName = software.amazon.jsii.Kernel.get(this, "hostName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.manualPrefixRegexp = software.amazon.jsii.Kernel.get(this, "manualPrefixRegexp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messagePerRequest = software.amazon.jsii.Kernel.get(this, "messagePerRequest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.multilineProcessingEnabled = software.amazon.jsii.Kernel.get(this, "multilineProcessingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(com.sumologic.kinesis_log_source.KinesisLogSourcePath.class));
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
            this.contentType = java.util.Objects.requireNonNull(builder.contentType, "contentType is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.authentication = builder.authentication;
            this.automaticDateParsing = builder.automaticDateParsing;
            this.category = builder.category;
            this.cutoffRelativeTime = builder.cutoffRelativeTime;
            this.cutoffTimestamp = builder.cutoffTimestamp;
            this.defaultDateFormats = builder.defaultDateFormats;
            this.description = builder.description;
            this.fields = builder.fields;
            this.filters = builder.filters;
            this.forceTimezone = builder.forceTimezone;
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.manualPrefixRegexp = builder.manualPrefixRegexp;
            this.messagePerRequest = builder.messagePerRequest;
            this.multilineProcessingEnabled = builder.multilineProcessingEnabled;
            this.path = builder.path;
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
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final com.sumologic.kinesis_log_source.KinesisLogSourceAuthentication getAuthentication() {
            return this.authentication;
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
        public final java.lang.String getDescription() {
            return this.description;
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
        public final java.lang.Object getMessagePerRequest() {
            return this.messagePerRequest;
        }

        @Override
        public final java.lang.Object getMultilineProcessingEnabled() {
            return this.multilineProcessingEnabled;
        }

        @Override
        public final com.sumologic.kinesis_log_source.KinesisLogSourcePath getPath() {
            return this.path;
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
            data.set("contentType", om.valueToTree(this.getContentType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAuthentication() != null) {
                data.set("authentication", om.valueToTree(this.getAuthentication()));
            }
            if (this.getAutomaticDateParsing() != null) {
                data.set("automaticDateParsing", om.valueToTree(this.getAutomaticDateParsing()));
            }
            if (this.getCategory() != null) {
                data.set("category", om.valueToTree(this.getCategory()));
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
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
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
            if (this.getMessagePerRequest() != null) {
                data.set("messagePerRequest", om.valueToTree(this.getMessagePerRequest()));
            }
            if (this.getMultilineProcessingEnabled() != null) {
                data.set("multilineProcessingEnabled", om.valueToTree(this.getMultilineProcessingEnabled()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
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
            struct.set("fqn", om.valueToTree("sumologic.kinesisLogSource.KinesisLogSourceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisLogSourceConfig.Jsii$Proxy that = (KinesisLogSourceConfig.Jsii$Proxy) o;

            if (!collectorId.equals(that.collectorId)) return false;
            if (!contentType.equals(that.contentType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.authentication != null ? !this.authentication.equals(that.authentication) : that.authentication != null) return false;
            if (this.automaticDateParsing != null ? !this.automaticDateParsing.equals(that.automaticDateParsing) : that.automaticDateParsing != null) return false;
            if (this.category != null ? !this.category.equals(that.category) : that.category != null) return false;
            if (this.cutoffRelativeTime != null ? !this.cutoffRelativeTime.equals(that.cutoffRelativeTime) : that.cutoffRelativeTime != null) return false;
            if (this.cutoffTimestamp != null ? !this.cutoffTimestamp.equals(that.cutoffTimestamp) : that.cutoffTimestamp != null) return false;
            if (this.defaultDateFormats != null ? !this.defaultDateFormats.equals(that.defaultDateFormats) : that.defaultDateFormats != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.fields != null ? !this.fields.equals(that.fields) : that.fields != null) return false;
            if (this.filters != null ? !this.filters.equals(that.filters) : that.filters != null) return false;
            if (this.forceTimezone != null ? !this.forceTimezone.equals(that.forceTimezone) : that.forceTimezone != null) return false;
            if (this.hostName != null ? !this.hostName.equals(that.hostName) : that.hostName != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.manualPrefixRegexp != null ? !this.manualPrefixRegexp.equals(that.manualPrefixRegexp) : that.manualPrefixRegexp != null) return false;
            if (this.messagePerRequest != null ? !this.messagePerRequest.equals(that.messagePerRequest) : that.messagePerRequest != null) return false;
            if (this.multilineProcessingEnabled != null ? !this.multilineProcessingEnabled.equals(that.multilineProcessingEnabled) : that.multilineProcessingEnabled != null) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
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
            result = 31 * result + (this.contentType.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.authentication != null ? this.authentication.hashCode() : 0);
            result = 31 * result + (this.automaticDateParsing != null ? this.automaticDateParsing.hashCode() : 0);
            result = 31 * result + (this.category != null ? this.category.hashCode() : 0);
            result = 31 * result + (this.cutoffRelativeTime != null ? this.cutoffRelativeTime.hashCode() : 0);
            result = 31 * result + (this.cutoffTimestamp != null ? this.cutoffTimestamp.hashCode() : 0);
            result = 31 * result + (this.defaultDateFormats != null ? this.defaultDateFormats.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.fields != null ? this.fields.hashCode() : 0);
            result = 31 * result + (this.filters != null ? this.filters.hashCode() : 0);
            result = 31 * result + (this.forceTimezone != null ? this.forceTimezone.hashCode() : 0);
            result = 31 * result + (this.hostName != null ? this.hostName.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.manualPrefixRegexp != null ? this.manualPrefixRegexp.hashCode() : 0);
            result = 31 * result + (this.messagePerRequest != null ? this.messagePerRequest.hashCode() : 0);
            result = 31 * result + (this.multilineProcessingEnabled != null ? this.multilineProcessingEnabled.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
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
