package com.sumologic.cse_log_mapping;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping sumologic_cse_log_mapping}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.716Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMapping")
public class CseLogMapping extends com.hashicorp.cdktf.TerraformResource {

    protected CseLogMapping(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseLogMapping(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.cse_log_mapping.CseLogMapping.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping sumologic_cse_log_mapping} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CseLogMapping(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a CseLogMapping resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseLogMapping to import. This parameter is required.
     * @param importFromId The id of the existing CseLogMapping that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the CseLogMapping to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_log_mapping.CseLogMapping.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a CseLogMapping resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseLogMapping to import. This parameter is required.
     * @param importFromId The id of the existing CseLogMapping that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_log_mapping.CseLogMapping.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putFields(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFields>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFields> __cast_cd4240 = (java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFields>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_log_mapping.CseLogMappingFields __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putFields", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStructuredInputs(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs> __cast_cd4240 = (java.util.List<com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putStructuredInputs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUnstructuredFields(final @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields value) {
        software.amazon.jsii.Kernel.call(this, "putUnstructuredFields", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParentId() {
        software.amazon.jsii.Kernel.call(this, "resetParentId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRelatesEntities() {
        software.amazon.jsii.Kernel.call(this, "resetRelatesEntities", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkippedValues() {
        software.amazon.jsii.Kernel.call(this, "resetSkippedValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStructuredInputs() {
        software.amazon.jsii.Kernel.call(this, "resetStructuredInputs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUnstructuredFields() {
        software.amazon.jsii.Kernel.call(this, "resetUnstructuredFields", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingFieldsList getFields() {
        return software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingFieldsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingStructuredInputsList getStructuredInputs() {
        return software.amazon.jsii.Kernel.get(this, "structuredInputs", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingStructuredInputsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFieldsOutputReference getUnstructuredFields() {
        return software.amazon.jsii.Kernel.get(this, "unstructuredFields", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFieldsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFieldsInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParentIdInput() {
        return software.amazon.jsii.Kernel.get(this, "parentIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProductGuidInput() {
        return software.amazon.jsii.Kernel.get(this, "productGuidInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRecordTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "recordTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRelatesEntitiesInput() {
        return software.amazon.jsii.Kernel.get(this, "relatesEntitiesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSkippedValuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "skippedValuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStructuredInputsInput() {
        return software.amazon.jsii.Kernel.get(this, "structuredInputsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields getUnstructuredFieldsInput() {
        return software.amazon.jsii.Kernel.get(this, "unstructuredFieldsInput", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParentId() {
        return software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParentId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parentId", java.util.Objects.requireNonNull(value, "parentId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProductGuid() {
        return software.amazon.jsii.Kernel.get(this, "productGuid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProductGuid(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "productGuid", java.util.Objects.requireNonNull(value, "productGuid is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRecordType() {
        return software.amazon.jsii.Kernel.get(this, "recordType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRecordType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "recordType", java.util.Objects.requireNonNull(value, "recordType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRelatesEntities() {
        return software.amazon.jsii.Kernel.get(this, "relatesEntities", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRelatesEntities(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "relatesEntities", java.util.Objects.requireNonNull(value, "relatesEntities is required"));
    }

    public void setRelatesEntities(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "relatesEntities", java.util.Objects.requireNonNull(value, "relatesEntities is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSkippedValues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "skippedValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSkippedValues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "skippedValues", java.util.Objects.requireNonNull(value, "skippedValues is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.cse_log_mapping.CseLogMapping}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.cse_log_mapping.CseLogMapping> {
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
        private final com.sumologic.cse_log_mapping.CseLogMappingConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.cse_log_mapping.CseLogMappingConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * fields block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#fields CseLogMapping#fields}
         * <p>
         * @return {@code this}
         * @param fields fields block. This parameter is required.
         */
        public Builder fields(final com.hashicorp.cdktf.IResolvable fields) {
            this.config.fields(fields);
            return this;
        }
        /**
         * fields block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#fields CseLogMapping#fields}
         * <p>
         * @return {@code this}
         * @param fields fields block. This parameter is required.
         */
        public Builder fields(final java.util.List<? extends com.sumologic.cse_log_mapping.CseLogMappingFields> fields) {
            this.config.fields(fields);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product_guid CseLogMapping#product_guid}.
         * <p>
         * @return {@code this}
         * @param productGuid Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product_guid CseLogMapping#product_guid}. This parameter is required.
         */
        public Builder productGuid(final java.lang.String productGuid) {
            this.config.productGuid(productGuid);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#record_type CseLogMapping#record_type}.
         * <p>
         * @return {@code this}
         * @param recordType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#record_type CseLogMapping#record_type}. This parameter is required.
         */
        public Builder recordType(final java.lang.String recordType) {
            this.config.recordType(recordType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#id CseLogMapping#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#id CseLogMapping#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#parent_id CseLogMapping#parent_id}.
         * <p>
         * @return {@code this}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#parent_id CseLogMapping#parent_id}. This parameter is required.
         */
        public Builder parentId(final java.lang.String parentId) {
            this.config.parentId(parentId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}.
         * <p>
         * @return {@code this}
         * @param relatesEntities Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}. This parameter is required.
         */
        public Builder relatesEntities(final java.lang.Boolean relatesEntities) {
            this.config.relatesEntities(relatesEntities);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}.
         * <p>
         * @return {@code this}
         * @param relatesEntities Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}. This parameter is required.
         */
        public Builder relatesEntities(final com.hashicorp.cdktf.IResolvable relatesEntities) {
            this.config.relatesEntities(relatesEntities);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}.
         * <p>
         * @return {@code this}
         * @param skippedValues Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}. This parameter is required.
         */
        public Builder skippedValues(final java.util.List<java.lang.String> skippedValues) {
            this.config.skippedValues(skippedValues);
            return this;
        }

        /**
         * structured_inputs block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#structured_inputs CseLogMapping#structured_inputs}
         * <p>
         * @return {@code this}
         * @param structuredInputs structured_inputs block. This parameter is required.
         */
        public Builder structuredInputs(final com.hashicorp.cdktf.IResolvable structuredInputs) {
            this.config.structuredInputs(structuredInputs);
            return this;
        }
        /**
         * structured_inputs block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#structured_inputs CseLogMapping#structured_inputs}
         * <p>
         * @return {@code this}
         * @param structuredInputs structured_inputs block. This parameter is required.
         */
        public Builder structuredInputs(final java.util.List<? extends com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs> structuredInputs) {
            this.config.structuredInputs(structuredInputs);
            return this;
        }

        /**
         * unstructured_fields block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#unstructured_fields CseLogMapping#unstructured_fields}
         * <p>
         * @return {@code this}
         * @param unstructuredFields unstructured_fields block. This parameter is required.
         */
        public Builder unstructuredFields(final com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields unstructuredFields) {
            this.config.unstructuredFields(unstructuredFields);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.cse_log_mapping.CseLogMapping}.
         */
        @Override
        public com.sumologic.cse_log_mapping.CseLogMapping build() {
            return new com.sumologic.cse_log_mapping.CseLogMapping(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
