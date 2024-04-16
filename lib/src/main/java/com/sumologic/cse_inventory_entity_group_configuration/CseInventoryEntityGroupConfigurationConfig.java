package com.sumologic.cse_inventory_entity_group_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.715Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseInventoryEntityGroupConfiguration.CseInventoryEntityGroupConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(CseInventoryEntityGroupConfigurationConfig.Jsii$Proxy.class)
public interface CseInventoryEntityGroupConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_source CseInventoryEntityGroupConfiguration#inventory_source}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInventorySource();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_type CseInventoryEntityGroupConfiguration#inventory_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInventoryType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#name CseInventoryEntityGroupConfiguration#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#criticality CseInventoryEntityGroupConfiguration#criticality}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCriticality() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#description CseInventoryEntityGroupConfiguration#description}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#dynamic_tags CseInventoryEntityGroupConfiguration#dynamic_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDynamicTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#group CseInventoryEntityGroupConfiguration#group}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#id CseInventoryEntityGroupConfiguration#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_key CseInventoryEntityGroupConfiguration#inventory_key}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInventoryKey() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_value CseInventoryEntityGroupConfiguration#inventory_value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInventoryValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#suppressed CseInventoryEntityGroupConfiguration#suppressed}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSuppressed() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#tags CseInventoryEntityGroupConfiguration#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#tag_schema CseInventoryEntityGroupConfiguration#tag_schema}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTagSchema() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseInventoryEntityGroupConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseInventoryEntityGroupConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseInventoryEntityGroupConfigurationConfig> {
        java.lang.String inventorySource;
        java.lang.String inventoryType;
        java.lang.String name;
        java.lang.String criticality;
        java.lang.String description;
        java.lang.Object dynamicTags;
        java.lang.String group;
        java.lang.String id;
        java.lang.String inventoryKey;
        java.lang.String inventoryValue;
        java.lang.Object suppressed;
        java.util.List<java.lang.String> tags;
        java.lang.String tagSchema;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getInventorySource}
         * @param inventorySource Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_source CseInventoryEntityGroupConfiguration#inventory_source}. This parameter is required.
         * @return {@code this}
         */
        public Builder inventorySource(java.lang.String inventorySource) {
            this.inventorySource = inventorySource;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getInventoryType}
         * @param inventoryType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_type CseInventoryEntityGroupConfiguration#inventory_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder inventoryType(java.lang.String inventoryType) {
            this.inventoryType = inventoryType;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#name CseInventoryEntityGroupConfiguration#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getCriticality}
         * @param criticality Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#criticality CseInventoryEntityGroupConfiguration#criticality}.
         * @return {@code this}
         */
        public Builder criticality(java.lang.String criticality) {
            this.criticality = criticality;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#description CseInventoryEntityGroupConfiguration#description}.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getDynamicTags}
         * @param dynamicTags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#dynamic_tags CseInventoryEntityGroupConfiguration#dynamic_tags}.
         * @return {@code this}
         */
        public Builder dynamicTags(java.lang.Boolean dynamicTags) {
            this.dynamicTags = dynamicTags;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getDynamicTags}
         * @param dynamicTags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#dynamic_tags CseInventoryEntityGroupConfiguration#dynamic_tags}.
         * @return {@code this}
         */
        public Builder dynamicTags(com.hashicorp.cdktf.IResolvable dynamicTags) {
            this.dynamicTags = dynamicTags;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getGroup}
         * @param group Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#group CseInventoryEntityGroupConfiguration#group}.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#id CseInventoryEntityGroupConfiguration#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getInventoryKey}
         * @param inventoryKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_key CseInventoryEntityGroupConfiguration#inventory_key}.
         * @return {@code this}
         */
        public Builder inventoryKey(java.lang.String inventoryKey) {
            this.inventoryKey = inventoryKey;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getInventoryValue}
         * @param inventoryValue Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#inventory_value CseInventoryEntityGroupConfiguration#inventory_value}.
         * @return {@code this}
         */
        public Builder inventoryValue(java.lang.String inventoryValue) {
            this.inventoryValue = inventoryValue;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getSuppressed}
         * @param suppressed Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#suppressed CseInventoryEntityGroupConfiguration#suppressed}.
         * @return {@code this}
         */
        public Builder suppressed(java.lang.Boolean suppressed) {
            this.suppressed = suppressed;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getSuppressed}
         * @param suppressed Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#suppressed CseInventoryEntityGroupConfiguration#suppressed}.
         * @return {@code this}
         */
        public Builder suppressed(com.hashicorp.cdktf.IResolvable suppressed) {
            this.suppressed = suppressed;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#tags CseInventoryEntityGroupConfiguration#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.List<java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getTagSchema}
         * @param tagSchema Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_inventory_entity_group_configuration#tag_schema CseInventoryEntityGroupConfiguration#tag_schema}.
         * @return {@code this}
         */
        public Builder tagSchema(java.lang.String tagSchema) {
            this.tagSchema = tagSchema;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getDependsOn}
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
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseInventoryEntityGroupConfigurationConfig#getProvisioners}
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
         * @return a new instance of {@link CseInventoryEntityGroupConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseInventoryEntityGroupConfigurationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseInventoryEntityGroupConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseInventoryEntityGroupConfigurationConfig {
        private final java.lang.String inventorySource;
        private final java.lang.String inventoryType;
        private final java.lang.String name;
        private final java.lang.String criticality;
        private final java.lang.String description;
        private final java.lang.Object dynamicTags;
        private final java.lang.String group;
        private final java.lang.String id;
        private final java.lang.String inventoryKey;
        private final java.lang.String inventoryValue;
        private final java.lang.Object suppressed;
        private final java.util.List<java.lang.String> tags;
        private final java.lang.String tagSchema;
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
            this.inventorySource = software.amazon.jsii.Kernel.get(this, "inventorySource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inventoryType = software.amazon.jsii.Kernel.get(this, "inventoryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.criticality = software.amazon.jsii.Kernel.get(this, "criticality", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dynamicTags = software.amazon.jsii.Kernel.get(this, "dynamicTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inventoryKey = software.amazon.jsii.Kernel.get(this, "inventoryKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inventoryValue = software.amazon.jsii.Kernel.get(this, "inventoryValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.suppressed = software.amazon.jsii.Kernel.get(this, "suppressed", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagSchema = software.amazon.jsii.Kernel.get(this, "tagSchema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.inventorySource = java.util.Objects.requireNonNull(builder.inventorySource, "inventorySource is required");
            this.inventoryType = java.util.Objects.requireNonNull(builder.inventoryType, "inventoryType is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.criticality = builder.criticality;
            this.description = builder.description;
            this.dynamicTags = builder.dynamicTags;
            this.group = builder.group;
            this.id = builder.id;
            this.inventoryKey = builder.inventoryKey;
            this.inventoryValue = builder.inventoryValue;
            this.suppressed = builder.suppressed;
            this.tags = builder.tags;
            this.tagSchema = builder.tagSchema;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getInventorySource() {
            return this.inventorySource;
        }

        @Override
        public final java.lang.String getInventoryType() {
            return this.inventoryType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getCriticality() {
            return this.criticality;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Object getDynamicTags() {
            return this.dynamicTags;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getInventoryKey() {
            return this.inventoryKey;
        }

        @Override
        public final java.lang.String getInventoryValue() {
            return this.inventoryValue;
        }

        @Override
        public final java.lang.Object getSuppressed() {
            return this.suppressed;
        }

        @Override
        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTagSchema() {
            return this.tagSchema;
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

            data.set("inventorySource", om.valueToTree(this.getInventorySource()));
            data.set("inventoryType", om.valueToTree(this.getInventoryType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getCriticality() != null) {
                data.set("criticality", om.valueToTree(this.getCriticality()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDynamicTags() != null) {
                data.set("dynamicTags", om.valueToTree(this.getDynamicTags()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getInventoryKey() != null) {
                data.set("inventoryKey", om.valueToTree(this.getInventoryKey()));
            }
            if (this.getInventoryValue() != null) {
                data.set("inventoryValue", om.valueToTree(this.getInventoryValue()));
            }
            if (this.getSuppressed() != null) {
                data.set("suppressed", om.valueToTree(this.getSuppressed()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagSchema() != null) {
                data.set("tagSchema", om.valueToTree(this.getTagSchema()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseInventoryEntityGroupConfiguration.CseInventoryEntityGroupConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseInventoryEntityGroupConfigurationConfig.Jsii$Proxy that = (CseInventoryEntityGroupConfigurationConfig.Jsii$Proxy) o;

            if (!inventorySource.equals(that.inventorySource)) return false;
            if (!inventoryType.equals(that.inventoryType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.criticality != null ? !this.criticality.equals(that.criticality) : that.criticality != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.dynamicTags != null ? !this.dynamicTags.equals(that.dynamicTags) : that.dynamicTags != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.inventoryKey != null ? !this.inventoryKey.equals(that.inventoryKey) : that.inventoryKey != null) return false;
            if (this.inventoryValue != null ? !this.inventoryValue.equals(that.inventoryValue) : that.inventoryValue != null) return false;
            if (this.suppressed != null ? !this.suppressed.equals(that.suppressed) : that.suppressed != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagSchema != null ? !this.tagSchema.equals(that.tagSchema) : that.tagSchema != null) return false;
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
            int result = this.inventorySource.hashCode();
            result = 31 * result + (this.inventoryType.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.criticality != null ? this.criticality.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.dynamicTags != null ? this.dynamicTags.hashCode() : 0);
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.inventoryKey != null ? this.inventoryKey.hashCode() : 0);
            result = 31 * result + (this.inventoryValue != null ? this.inventoryValue.hashCode() : 0);
            result = 31 * result + (this.suppressed != null ? this.suppressed.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagSchema != null ? this.tagSchema.hashCode() : 0);
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
