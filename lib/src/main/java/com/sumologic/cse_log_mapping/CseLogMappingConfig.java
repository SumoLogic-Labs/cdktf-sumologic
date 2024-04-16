package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.744Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingConfig")
@software.amazon.jsii.Jsii.Proxy(CseLogMappingConfig.Jsii$Proxy.class)
public interface CseLogMappingConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * fields block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#fields CseLogMapping#fields}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getFields();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product_guid CseLogMapping#product_guid}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProductGuid();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#record_type CseLogMapping#record_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRecordType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#id CseLogMapping#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#parent_id CseLogMapping#parent_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParentId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRelatesEntities() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSkippedValues() {
        return null;
    }

    /**
     * structured_inputs block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#structured_inputs CseLogMapping#structured_inputs}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getStructuredInputs() {
        return null;
    }

    /**
     * unstructured_fields block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#unstructured_fields CseLogMapping#unstructured_fields}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields getUnstructuredFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseLogMappingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseLogMappingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseLogMappingConfig> {
        java.lang.Object enabled;
        java.lang.Object fields;
        java.lang.String name;
        java.lang.String productGuid;
        java.lang.String recordType;
        java.lang.String id;
        java.lang.String parentId;
        java.lang.Object relatesEntities;
        java.util.List<java.lang.String> skippedValues;
        java.lang.Object structuredInputs;
        com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields unstructuredFields;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CseLogMappingConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#enabled CseLogMapping#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getFields}
         * @param fields fields block. This parameter is required.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#fields CseLogMapping#fields}
         * @return {@code this}
         */
        public Builder fields(com.hashicorp.cdktf.IResolvable fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getFields}
         * @param fields fields block. This parameter is required.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#fields CseLogMapping#fields}
         * @return {@code this}
         */
        public Builder fields(java.util.List<? extends com.sumologic.cse_log_mapping.CseLogMappingFields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getProductGuid}
         * @param productGuid Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product_guid CseLogMapping#product_guid}. This parameter is required.
         * @return {@code this}
         */
        public Builder productGuid(java.lang.String productGuid) {
            this.productGuid = productGuid;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getRecordType}
         * @param recordType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#record_type CseLogMapping#record_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder recordType(java.lang.String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#id CseLogMapping#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getParentId}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#parent_id CseLogMapping#parent_id}.
         * @return {@code this}
         */
        public Builder parentId(java.lang.String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getRelatesEntities}
         * @param relatesEntities Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}.
         * @return {@code this}
         */
        public Builder relatesEntities(java.lang.Boolean relatesEntities) {
            this.relatesEntities = relatesEntities;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getRelatesEntities}
         * @param relatesEntities Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#relates_entities CseLogMapping#relates_entities}.
         * @return {@code this}
         */
        public Builder relatesEntities(com.hashicorp.cdktf.IResolvable relatesEntities) {
            this.relatesEntities = relatesEntities;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getSkippedValues}
         * @param skippedValues Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}.
         * @return {@code this}
         */
        public Builder skippedValues(java.util.List<java.lang.String> skippedValues) {
            this.skippedValues = skippedValues;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getStructuredInputs}
         * @param structuredInputs structured_inputs block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#structured_inputs CseLogMapping#structured_inputs}
         * @return {@code this}
         */
        public Builder structuredInputs(com.hashicorp.cdktf.IResolvable structuredInputs) {
            this.structuredInputs = structuredInputs;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getStructuredInputs}
         * @param structuredInputs structured_inputs block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#structured_inputs CseLogMapping#structured_inputs}
         * @return {@code this}
         */
        public Builder structuredInputs(java.util.List<? extends com.sumologic.cse_log_mapping.CseLogMappingStructuredInputs> structuredInputs) {
            this.structuredInputs = structuredInputs;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getUnstructuredFields}
         * @param unstructuredFields unstructured_fields block.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#unstructured_fields CseLogMapping#unstructured_fields}
         * @return {@code this}
         */
        public Builder unstructuredFields(com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields unstructuredFields) {
            this.unstructuredFields = unstructuredFields;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getDependsOn}
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
         * Sets the value of {@link CseLogMappingConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingConfig#getProvisioners}
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
         * @return a new instance of {@link CseLogMappingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseLogMappingConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseLogMappingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseLogMappingConfig {
        private final java.lang.Object enabled;
        private final java.lang.Object fields;
        private final java.lang.String name;
        private final java.lang.String productGuid;
        private final java.lang.String recordType;
        private final java.lang.String id;
        private final java.lang.String parentId;
        private final java.lang.Object relatesEntities;
        private final java.util.List<java.lang.String> skippedValues;
        private final java.lang.Object structuredInputs;
        private final com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields unstructuredFields;
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
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.productGuid = software.amazon.jsii.Kernel.get(this, "productGuid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.recordType = software.amazon.jsii.Kernel.get(this, "recordType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parentId = software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.relatesEntities = software.amazon.jsii.Kernel.get(this, "relatesEntities", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skippedValues = software.amazon.jsii.Kernel.get(this, "skippedValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.structuredInputs = software.amazon.jsii.Kernel.get(this, "structuredInputs", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.unstructuredFields = software.amazon.jsii.Kernel.get(this, "unstructuredFields", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields.class));
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
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.fields = java.util.Objects.requireNonNull(builder.fields, "fields is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.productGuid = java.util.Objects.requireNonNull(builder.productGuid, "productGuid is required");
            this.recordType = java.util.Objects.requireNonNull(builder.recordType, "recordType is required");
            this.id = builder.id;
            this.parentId = builder.parentId;
            this.relatesEntities = builder.relatesEntities;
            this.skippedValues = builder.skippedValues;
            this.structuredInputs = builder.structuredInputs;
            this.unstructuredFields = builder.unstructuredFields;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Object getFields() {
            return this.fields;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getProductGuid() {
            return this.productGuid;
        }

        @Override
        public final java.lang.String getRecordType() {
            return this.recordType;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        @Override
        public final java.lang.Object getRelatesEntities() {
            return this.relatesEntities;
        }

        @Override
        public final java.util.List<java.lang.String> getSkippedValues() {
            return this.skippedValues;
        }

        @Override
        public final java.lang.Object getStructuredInputs() {
            return this.structuredInputs;
        }

        @Override
        public final com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields getUnstructuredFields() {
            return this.unstructuredFields;
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

            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("fields", om.valueToTree(this.getFields()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("productGuid", om.valueToTree(this.getProductGuid()));
            data.set("recordType", om.valueToTree(this.getRecordType()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getParentId() != null) {
                data.set("parentId", om.valueToTree(this.getParentId()));
            }
            if (this.getRelatesEntities() != null) {
                data.set("relatesEntities", om.valueToTree(this.getRelatesEntities()));
            }
            if (this.getSkippedValues() != null) {
                data.set("skippedValues", om.valueToTree(this.getSkippedValues()));
            }
            if (this.getStructuredInputs() != null) {
                data.set("structuredInputs", om.valueToTree(this.getStructuredInputs()));
            }
            if (this.getUnstructuredFields() != null) {
                data.set("unstructuredFields", om.valueToTree(this.getUnstructuredFields()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseLogMapping.CseLogMappingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseLogMappingConfig.Jsii$Proxy that = (CseLogMappingConfig.Jsii$Proxy) o;

            if (!enabled.equals(that.enabled)) return false;
            if (!fields.equals(that.fields)) return false;
            if (!name.equals(that.name)) return false;
            if (!productGuid.equals(that.productGuid)) return false;
            if (!recordType.equals(that.recordType)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.parentId != null ? !this.parentId.equals(that.parentId) : that.parentId != null) return false;
            if (this.relatesEntities != null ? !this.relatesEntities.equals(that.relatesEntities) : that.relatesEntities != null) return false;
            if (this.skippedValues != null ? !this.skippedValues.equals(that.skippedValues) : that.skippedValues != null) return false;
            if (this.structuredInputs != null ? !this.structuredInputs.equals(that.structuredInputs) : that.structuredInputs != null) return false;
            if (this.unstructuredFields != null ? !this.unstructuredFields.equals(that.unstructuredFields) : that.unstructuredFields != null) return false;
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
            int result = this.enabled.hashCode();
            result = 31 * result + (this.fields.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.productGuid.hashCode());
            result = 31 * result + (this.recordType.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.parentId != null ? this.parentId.hashCode() : 0);
            result = 31 * result + (this.relatesEntities != null ? this.relatesEntities.hashCode() : 0);
            result = 31 * result + (this.skippedValues != null ? this.skippedValues.hashCode() : 0);
            result = 31 * result + (this.structuredInputs != null ? this.structuredInputs.hashCode() : 0);
            result = 31 * result + (this.unstructuredFields != null ? this.unstructuredFields.hashCode() : 0);
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
