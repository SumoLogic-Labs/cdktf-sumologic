package com.sumologic.metadata_source;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source sumologic_metadata_source}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.096Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metadataSource.MetadataSource")
public class MetadataSource extends com.hashicorp.cdktf.TerraformResource {

    protected MetadataSource(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MetadataSource(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.metadata_source.MetadataSource.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source sumologic_metadata_source} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public MetadataSource(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a MetadataSource resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the MetadataSource to import. This parameter is required.
     * @param importFromId The id of the existing MetadataSource that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the MetadataSource to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.metadata_source.MetadataSource.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a MetadataSource resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the MetadataSource to import. This parameter is required.
     * @param importFromId The id of the existing MetadataSource that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.metadata_source.MetadataSource.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putAuthentication(final @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourceAuthentication value) {
        software.amazon.jsii.Kernel.call(this, "putAuthentication", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDefaultDateFormats(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.metadata_source.MetadataSourceDefaultDateFormats>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.metadata_source.MetadataSourceDefaultDateFormats> __cast_cd4240 = (java.util.List<com.sumologic.metadata_source.MetadataSourceDefaultDateFormats>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.metadata_source.MetadataSourceDefaultDateFormats __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putDefaultDateFormats", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFilters(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.metadata_source.MetadataSourceFilters>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.metadata_source.MetadataSourceFilters> __cast_cd4240 = (java.util.List<com.sumologic.metadata_source.MetadataSourceFilters>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.metadata_source.MetadataSourceFilters __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putFilters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPath(final @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourcePath value) {
        software.amazon.jsii.Kernel.call(this, "putPath", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutomaticDateParsing() {
        software.amazon.jsii.Kernel.call(this, "resetAutomaticDateParsing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCategory() {
        software.amazon.jsii.Kernel.call(this, "resetCategory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCutoffRelativeTime() {
        software.amazon.jsii.Kernel.call(this, "resetCutoffRelativeTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCutoffTimestamp() {
        software.amazon.jsii.Kernel.call(this, "resetCutoffTimestamp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultDateFormats() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultDateFormats", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFields() {
        software.amazon.jsii.Kernel.call(this, "resetFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilters() {
        software.amazon.jsii.Kernel.call(this, "resetFilters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceTimezone() {
        software.amazon.jsii.Kernel.call(this, "resetForceTimezone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostName() {
        software.amazon.jsii.Kernel.call(this, "resetHostName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManualPrefixRegexp() {
        software.amazon.jsii.Kernel.call(this, "resetManualPrefixRegexp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMultilineProcessingEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetMultilineProcessingEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimezone() {
        software.amazon.jsii.Kernel.call(this, "resetTimezone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseAutolineMatching() {
        software.amazon.jsii.Kernel.call(this, "resetUseAutolineMatching", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourceAuthenticationOutputReference getAuthentication() {
        return software.amazon.jsii.Kernel.get(this, "authentication", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourceAuthenticationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourceDefaultDateFormatsList getDefaultDateFormats() {
        return software.amazon.jsii.Kernel.get(this, "defaultDateFormats", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourceDefaultDateFormatsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourceFiltersList getFilters() {
        return software.amazon.jsii.Kernel.get(this, "filters", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourceFiltersList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.metadata_source.MetadataSourcePathOutputReference getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourcePathOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metadata_source.MetadataSourceAuthentication getAuthenticationInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourceAuthentication.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutomaticDateParsingInput() {
        return software.amazon.jsii.Kernel.get(this, "automaticDateParsingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCategoryInput() {
        return software.amazon.jsii.Kernel.get(this, "categoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCollectorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "collectorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCutoffRelativeTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "cutoffRelativeTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCutoffTimestampInput() {
        return software.amazon.jsii.Kernel.get(this, "cutoffTimestampInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDefaultDateFormatsInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultDateFormatsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFieldsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "fieldsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFiltersInput() {
        return software.amazon.jsii.Kernel.get(this, "filtersInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceTimezoneInput() {
        return software.amazon.jsii.Kernel.get(this, "forceTimezoneInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostNameInput() {
        return software.amazon.jsii.Kernel.get(this, "hostNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getManualPrefixRegexpInput() {
        return software.amazon.jsii.Kernel.get(this, "manualPrefixRegexpInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMultilineProcessingEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "multilineProcessingEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.metadata_source.MetadataSourcePath getPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pathInput", software.amazon.jsii.NativeType.forClass(com.sumologic.metadata_source.MetadataSourcePath.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPausedInput() {
        return software.amazon.jsii.Kernel.get(this, "pausedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getScanIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "scanIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimezoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timezoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseAutolineMatchingInput() {
        return software.amazon.jsii.Kernel.get(this, "useAutolineMatchingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutomaticDateParsing() {
        return software.amazon.jsii.Kernel.get(this, "automaticDateParsing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutomaticDateParsing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "automaticDateParsing", java.util.Objects.requireNonNull(value, "automaticDateParsing is required"));
    }

    public void setAutomaticDateParsing(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "automaticDateParsing", java.util.Objects.requireNonNull(value, "automaticDateParsing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCategory() {
        return software.amazon.jsii.Kernel.get(this, "category", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCategory(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "category", java.util.Objects.requireNonNull(value, "category is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCollectorId() {
        return software.amazon.jsii.Kernel.get(this, "collectorId", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCollectorId(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "collectorId", java.util.Objects.requireNonNull(value, "collectorId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentType() {
        return software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentType", java.util.Objects.requireNonNull(value, "contentType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCutoffRelativeTime() {
        return software.amazon.jsii.Kernel.get(this, "cutoffRelativeTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCutoffRelativeTime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cutoffRelativeTime", java.util.Objects.requireNonNull(value, "cutoffRelativeTime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCutoffTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "cutoffTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCutoffTimestamp(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cutoffTimestamp", java.util.Objects.requireNonNull(value, "cutoffTimestamp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getFields() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setFields(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "fields", java.util.Objects.requireNonNull(value, "fields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceTimezone() {
        return software.amazon.jsii.Kernel.get(this, "forceTimezone", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceTimezone(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceTimezone", java.util.Objects.requireNonNull(value, "forceTimezone is required"));
    }

    public void setForceTimezone(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceTimezone", java.util.Objects.requireNonNull(value, "forceTimezone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostName() {
        return software.amazon.jsii.Kernel.get(this, "hostName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostName", java.util.Objects.requireNonNull(value, "hostName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getManualPrefixRegexp() {
        return software.amazon.jsii.Kernel.get(this, "manualPrefixRegexp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setManualPrefixRegexp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "manualPrefixRegexp", java.util.Objects.requireNonNull(value, "manualPrefixRegexp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMultilineProcessingEnabled() {
        return software.amazon.jsii.Kernel.get(this, "multilineProcessingEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMultilineProcessingEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "multilineProcessingEnabled", java.util.Objects.requireNonNull(value, "multilineProcessingEnabled is required"));
    }

    public void setMultilineProcessingEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "multilineProcessingEnabled", java.util.Objects.requireNonNull(value, "multilineProcessingEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPaused() {
        return software.amazon.jsii.Kernel.get(this, "paused", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPaused(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "paused", java.util.Objects.requireNonNull(value, "paused is required"));
    }

    public void setPaused(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "paused", java.util.Objects.requireNonNull(value, "paused is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getScanInterval() {
        return software.amazon.jsii.Kernel.get(this, "scanInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setScanInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "scanInterval", java.util.Objects.requireNonNull(value, "scanInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimezone() {
        return software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimezone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timezone", java.util.Objects.requireNonNull(value, "timezone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseAutolineMatching() {
        return software.amazon.jsii.Kernel.get(this, "useAutolineMatching", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseAutolineMatching(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useAutolineMatching", java.util.Objects.requireNonNull(value, "useAutolineMatching is required"));
    }

    public void setUseAutolineMatching(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useAutolineMatching", java.util.Objects.requireNonNull(value, "useAutolineMatching is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.metadata_source.MetadataSource}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.metadata_source.MetadataSource> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final com.sumologic.metadata_source.MetadataSourceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.metadata_source.MetadataSourceConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }
        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final com.hashicorp.cdktf.TerraformCount count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * authentication block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#authentication MetadataSource#authentication}
         * <p>
         * @return {@code this}
         * @param authentication authentication block. This parameter is required.
         */
        public Builder authentication(final com.sumologic.metadata_source.MetadataSourceAuthentication authentication) {
            this.config.authentication(authentication);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#collector_id MetadataSource#collector_id}.
         * <p>
         * @return {@code this}
         * @param collectorId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#collector_id MetadataSource#collector_id}. This parameter is required.
         */
        public Builder collectorId(final java.lang.Number collectorId) {
            this.config.collectorId(collectorId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#content_type MetadataSource#content_type}.
         * <p>
         * @return {@code this}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#content_type MetadataSource#content_type}. This parameter is required.
         */
        public Builder contentType(final java.lang.String contentType) {
            this.config.contentType(contentType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#name MetadataSource#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#name MetadataSource#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * path block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#path MetadataSource#path}
         * <p>
         * @return {@code this}
         * @param path path block. This parameter is required.
         */
        public Builder path(final com.sumologic.metadata_source.MetadataSourcePath path) {
            this.config.path(path);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#paused MetadataSource#paused}.
         * <p>
         * @return {@code this}
         * @param paused Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#paused MetadataSource#paused}. This parameter is required.
         */
        public Builder paused(final java.lang.Boolean paused) {
            this.config.paused(paused);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#paused MetadataSource#paused}.
         * <p>
         * @return {@code this}
         * @param paused Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#paused MetadataSource#paused}. This parameter is required.
         */
        public Builder paused(final com.hashicorp.cdktf.IResolvable paused) {
            this.config.paused(paused);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#scan_interval MetadataSource#scan_interval}.
         * <p>
         * @return {@code this}
         * @param scanInterval Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#scan_interval MetadataSource#scan_interval}. This parameter is required.
         */
        public Builder scanInterval(final java.lang.Number scanInterval) {
            this.config.scanInterval(scanInterval);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#automatic_date_parsing MetadataSource#automatic_date_parsing}.
         * <p>
         * @return {@code this}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#automatic_date_parsing MetadataSource#automatic_date_parsing}. This parameter is required.
         */
        public Builder automaticDateParsing(final java.lang.Boolean automaticDateParsing) {
            this.config.automaticDateParsing(automaticDateParsing);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#automatic_date_parsing MetadataSource#automatic_date_parsing}.
         * <p>
         * @return {@code this}
         * @param automaticDateParsing Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#automatic_date_parsing MetadataSource#automatic_date_parsing}. This parameter is required.
         */
        public Builder automaticDateParsing(final com.hashicorp.cdktf.IResolvable automaticDateParsing) {
            this.config.automaticDateParsing(automaticDateParsing);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#category MetadataSource#category}.
         * <p>
         * @return {@code this}
         * @param category Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#category MetadataSource#category}. This parameter is required.
         */
        public Builder category(final java.lang.String category) {
            this.config.category(category);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#cutoff_relative_time MetadataSource#cutoff_relative_time}.
         * <p>
         * @return {@code this}
         * @param cutoffRelativeTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#cutoff_relative_time MetadataSource#cutoff_relative_time}. This parameter is required.
         */
        public Builder cutoffRelativeTime(final java.lang.String cutoffRelativeTime) {
            this.config.cutoffRelativeTime(cutoffRelativeTime);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#cutoff_timestamp MetadataSource#cutoff_timestamp}.
         * <p>
         * @return {@code this}
         * @param cutoffTimestamp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#cutoff_timestamp MetadataSource#cutoff_timestamp}. This parameter is required.
         */
        public Builder cutoffTimestamp(final java.lang.Number cutoffTimestamp) {
            this.config.cutoffTimestamp(cutoffTimestamp);
            return this;
        }

        /**
         * default_date_formats block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#default_date_formats MetadataSource#default_date_formats}
         * <p>
         * @return {@code this}
         * @param defaultDateFormats default_date_formats block. This parameter is required.
         */
        public Builder defaultDateFormats(final com.hashicorp.cdktf.IResolvable defaultDateFormats) {
            this.config.defaultDateFormats(defaultDateFormats);
            return this;
        }
        /**
         * default_date_formats block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#default_date_formats MetadataSource#default_date_formats}
         * <p>
         * @return {@code this}
         * @param defaultDateFormats default_date_formats block. This parameter is required.
         */
        public Builder defaultDateFormats(final java.util.List<? extends com.sumologic.metadata_source.MetadataSourceDefaultDateFormats> defaultDateFormats) {
            this.config.defaultDateFormats(defaultDateFormats);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#description MetadataSource#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#description MetadataSource#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#fields MetadataSource#fields}.
         * <p>
         * @return {@code this}
         * @param fields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#fields MetadataSource#fields}. This parameter is required.
         */
        public Builder fields(final java.util.Map<java.lang.String, java.lang.String> fields) {
            this.config.fields(fields);
            return this;
        }

        /**
         * filters block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#filters MetadataSource#filters}
         * <p>
         * @return {@code this}
         * @param filters filters block. This parameter is required.
         */
        public Builder filters(final com.hashicorp.cdktf.IResolvable filters) {
            this.config.filters(filters);
            return this;
        }
        /**
         * filters block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#filters MetadataSource#filters}
         * <p>
         * @return {@code this}
         * @param filters filters block. This parameter is required.
         */
        public Builder filters(final java.util.List<? extends com.sumologic.metadata_source.MetadataSourceFilters> filters) {
            this.config.filters(filters);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#force_timezone MetadataSource#force_timezone}.
         * <p>
         * @return {@code this}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#force_timezone MetadataSource#force_timezone}. This parameter is required.
         */
        public Builder forceTimezone(final java.lang.Boolean forceTimezone) {
            this.config.forceTimezone(forceTimezone);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#force_timezone MetadataSource#force_timezone}.
         * <p>
         * @return {@code this}
         * @param forceTimezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#force_timezone MetadataSource#force_timezone}. This parameter is required.
         */
        public Builder forceTimezone(final com.hashicorp.cdktf.IResolvable forceTimezone) {
            this.config.forceTimezone(forceTimezone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#host_name MetadataSource#host_name}.
         * <p>
         * @return {@code this}
         * @param hostName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#host_name MetadataSource#host_name}. This parameter is required.
         */
        public Builder hostName(final java.lang.String hostName) {
            this.config.hostName(hostName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#id MetadataSource#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#id MetadataSource#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#manual_prefix_regexp MetadataSource#manual_prefix_regexp}.
         * <p>
         * @return {@code this}
         * @param manualPrefixRegexp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#manual_prefix_regexp MetadataSource#manual_prefix_regexp}. This parameter is required.
         */
        public Builder manualPrefixRegexp(final java.lang.String manualPrefixRegexp) {
            this.config.manualPrefixRegexp(manualPrefixRegexp);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#multiline_processing_enabled MetadataSource#multiline_processing_enabled}.
         * <p>
         * @return {@code this}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#multiline_processing_enabled MetadataSource#multiline_processing_enabled}. This parameter is required.
         */
        public Builder multilineProcessingEnabled(final java.lang.Boolean multilineProcessingEnabled) {
            this.config.multilineProcessingEnabled(multilineProcessingEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#multiline_processing_enabled MetadataSource#multiline_processing_enabled}.
         * <p>
         * @return {@code this}
         * @param multilineProcessingEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#multiline_processing_enabled MetadataSource#multiline_processing_enabled}. This parameter is required.
         */
        public Builder multilineProcessingEnabled(final com.hashicorp.cdktf.IResolvable multilineProcessingEnabled) {
            this.config.multilineProcessingEnabled(multilineProcessingEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#timezone MetadataSource#timezone}.
         * <p>
         * @return {@code this}
         * @param timezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#timezone MetadataSource#timezone}. This parameter is required.
         */
        public Builder timezone(final java.lang.String timezone) {
            this.config.timezone(timezone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#use_autoline_matching MetadataSource#use_autoline_matching}.
         * <p>
         * @return {@code this}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#use_autoline_matching MetadataSource#use_autoline_matching}. This parameter is required.
         */
        public Builder useAutolineMatching(final java.lang.Boolean useAutolineMatching) {
            this.config.useAutolineMatching(useAutolineMatching);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#use_autoline_matching MetadataSource#use_autoline_matching}.
         * <p>
         * @return {@code this}
         * @param useAutolineMatching Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#use_autoline_matching MetadataSource#use_autoline_matching}. This parameter is required.
         */
        public Builder useAutolineMatching(final com.hashicorp.cdktf.IResolvable useAutolineMatching) {
            this.config.useAutolineMatching(useAutolineMatching);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.metadata_source.MetadataSource}.
         */
        @Override
        public com.sumologic.metadata_source.MetadataSource build() {
            return new com.sumologic.metadata_source.MetadataSource(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
