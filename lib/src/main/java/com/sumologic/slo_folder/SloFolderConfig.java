package com.sumologic.slo_folder;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.216Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.sloFolder.SloFolderConfig")
@software.amazon.jsii.Jsii.Proxy(SloFolderConfig.Jsii$Proxy.class)
public interface SloFolderConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#description SloFolder#description}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescription();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#name SloFolder#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#content_type SloFolder#content_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContentType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#created_at SloFolder#created_at}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreatedAt() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#created_by SloFolder#created_by}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreatedBy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#id SloFolder#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_locked SloFolder#is_locked}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsLocked() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_mutable SloFolder#is_mutable}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsMutable() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_system SloFolder#is_system}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsSystem() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#modified_at SloFolder#modified_at}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getModifiedAt() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#modified_by SloFolder#modified_by}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getModifiedBy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#parent_id SloFolder#parent_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParentId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#post_request_map SloFolder#post_request_map}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPostRequestMap() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#type SloFolder#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#version SloFolder#version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloFolderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloFolderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloFolderConfig> {
        java.lang.String description;
        java.lang.String name;
        java.lang.String contentType;
        java.lang.String createdAt;
        java.lang.String createdBy;
        java.lang.String id;
        java.lang.Object isLocked;
        java.lang.Object isMutable;
        java.lang.Object isSystem;
        java.lang.String modifiedAt;
        java.lang.String modifiedBy;
        java.lang.String parentId;
        java.util.Map<java.lang.String, java.lang.String> postRequestMap;
        java.lang.String type;
        java.lang.Number version;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link SloFolderConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#description SloFolder#description}. This parameter is required.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#name SloFolder#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#content_type SloFolder#content_type}.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getCreatedAt}
         * @param createdAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#created_at SloFolder#created_at}.
         * @return {@code this}
         */
        public Builder createdAt(java.lang.String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getCreatedBy}
         * @param createdBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#created_by SloFolder#created_by}.
         * @return {@code this}
         */
        public Builder createdBy(java.lang.String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#id SloFolder#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsLocked}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_locked SloFolder#is_locked}.
         * @return {@code this}
         */
        public Builder isLocked(java.lang.Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsLocked}
         * @param isLocked Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_locked SloFolder#is_locked}.
         * @return {@code this}
         */
        public Builder isLocked(com.hashicorp.cdktf.IResolvable isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsMutable}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_mutable SloFolder#is_mutable}.
         * @return {@code this}
         */
        public Builder isMutable(java.lang.Boolean isMutable) {
            this.isMutable = isMutable;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsMutable}
         * @param isMutable Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_mutable SloFolder#is_mutable}.
         * @return {@code this}
         */
        public Builder isMutable(com.hashicorp.cdktf.IResolvable isMutable) {
            this.isMutable = isMutable;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsSystem}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_system SloFolder#is_system}.
         * @return {@code this}
         */
        public Builder isSystem(java.lang.Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getIsSystem}
         * @param isSystem Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#is_system SloFolder#is_system}.
         * @return {@code this}
         */
        public Builder isSystem(com.hashicorp.cdktf.IResolvable isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getModifiedAt}
         * @param modifiedAt Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#modified_at SloFolder#modified_at}.
         * @return {@code this}
         */
        public Builder modifiedAt(java.lang.String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getModifiedBy}
         * @param modifiedBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#modified_by SloFolder#modified_by}.
         * @return {@code this}
         */
        public Builder modifiedBy(java.lang.String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getParentId}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#parent_id SloFolder#parent_id}.
         * @return {@code this}
         */
        public Builder parentId(java.lang.String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getPostRequestMap}
         * @param postRequestMap Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#post_request_map SloFolder#post_request_map}.
         * @return {@code this}
         */
        public Builder postRequestMap(java.util.Map<java.lang.String, java.lang.String> postRequestMap) {
            this.postRequestMap = postRequestMap;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#type SloFolder#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getVersion}
         * @param version Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo_folder#version SloFolder#version}.
         * @return {@code this}
         */
        public Builder version(java.lang.Number version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getDependsOn}
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
         * Sets the value of {@link SloFolderConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link SloFolderConfig#getProvisioners}
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
         * @return a new instance of {@link SloFolderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloFolderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloFolderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloFolderConfig {
        private final java.lang.String description;
        private final java.lang.String name;
        private final java.lang.String contentType;
        private final java.lang.String createdAt;
        private final java.lang.String createdBy;
        private final java.lang.String id;
        private final java.lang.Object isLocked;
        private final java.lang.Object isMutable;
        private final java.lang.Object isSystem;
        private final java.lang.String modifiedAt;
        private final java.lang.String modifiedBy;
        private final java.lang.String parentId;
        private final java.util.Map<java.lang.String, java.lang.String> postRequestMap;
        private final java.lang.String type;
        private final java.lang.Number version;
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
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createdAt = software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createdBy = software.amazon.jsii.Kernel.get(this, "createdBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isLocked = software.amazon.jsii.Kernel.get(this, "isLocked", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.isMutable = software.amazon.jsii.Kernel.get(this, "isMutable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.isSystem = software.amazon.jsii.Kernel.get(this, "isSystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.modifiedAt = software.amazon.jsii.Kernel.get(this, "modifiedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modifiedBy = software.amazon.jsii.Kernel.get(this, "modifiedBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parentId = software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postRequestMap = software.amazon.jsii.Kernel.get(this, "postRequestMap", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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
            this.description = java.util.Objects.requireNonNull(builder.description, "description is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.contentType = builder.contentType;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.id = builder.id;
            this.isLocked = builder.isLocked;
            this.isMutable = builder.isMutable;
            this.isSystem = builder.isSystem;
            this.modifiedAt = builder.modifiedAt;
            this.modifiedBy = builder.modifiedBy;
            this.parentId = builder.parentId;
            this.postRequestMap = builder.postRequestMap;
            this.type = builder.type;
            this.version = builder.version;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.String getCreatedAt() {
            return this.createdAt;
        }

        @Override
        public final java.lang.String getCreatedBy() {
            return this.createdBy;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIsLocked() {
            return this.isLocked;
        }

        @Override
        public final java.lang.Object getIsMutable() {
            return this.isMutable;
        }

        @Override
        public final java.lang.Object getIsSystem() {
            return this.isSystem;
        }

        @Override
        public final java.lang.String getModifiedAt() {
            return this.modifiedAt;
        }

        @Override
        public final java.lang.String getModifiedBy() {
            return this.modifiedBy;
        }

        @Override
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getPostRequestMap() {
            return this.postRequestMap;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getVersion() {
            return this.version;
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

            data.set("description", om.valueToTree(this.getDescription()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getContentType() != null) {
                data.set("contentType", om.valueToTree(this.getContentType()));
            }
            if (this.getCreatedAt() != null) {
                data.set("createdAt", om.valueToTree(this.getCreatedAt()));
            }
            if (this.getCreatedBy() != null) {
                data.set("createdBy", om.valueToTree(this.getCreatedBy()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsLocked() != null) {
                data.set("isLocked", om.valueToTree(this.getIsLocked()));
            }
            if (this.getIsMutable() != null) {
                data.set("isMutable", om.valueToTree(this.getIsMutable()));
            }
            if (this.getIsSystem() != null) {
                data.set("isSystem", om.valueToTree(this.getIsSystem()));
            }
            if (this.getModifiedAt() != null) {
                data.set("modifiedAt", om.valueToTree(this.getModifiedAt()));
            }
            if (this.getModifiedBy() != null) {
                data.set("modifiedBy", om.valueToTree(this.getModifiedBy()));
            }
            if (this.getParentId() != null) {
                data.set("parentId", om.valueToTree(this.getParentId()));
            }
            if (this.getPostRequestMap() != null) {
                data.set("postRequestMap", om.valueToTree(this.getPostRequestMap()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
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
            struct.set("fqn", om.valueToTree("sumologic.sloFolder.SloFolderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloFolderConfig.Jsii$Proxy that = (SloFolderConfig.Jsii$Proxy) o;

            if (!description.equals(that.description)) return false;
            if (!name.equals(that.name)) return false;
            if (this.contentType != null ? !this.contentType.equals(that.contentType) : that.contentType != null) return false;
            if (this.createdAt != null ? !this.createdAt.equals(that.createdAt) : that.createdAt != null) return false;
            if (this.createdBy != null ? !this.createdBy.equals(that.createdBy) : that.createdBy != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isLocked != null ? !this.isLocked.equals(that.isLocked) : that.isLocked != null) return false;
            if (this.isMutable != null ? !this.isMutable.equals(that.isMutable) : that.isMutable != null) return false;
            if (this.isSystem != null ? !this.isSystem.equals(that.isSystem) : that.isSystem != null) return false;
            if (this.modifiedAt != null ? !this.modifiedAt.equals(that.modifiedAt) : that.modifiedAt != null) return false;
            if (this.modifiedBy != null ? !this.modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
            if (this.parentId != null ? !this.parentId.equals(that.parentId) : that.parentId != null) return false;
            if (this.postRequestMap != null ? !this.postRequestMap.equals(that.postRequestMap) : that.postRequestMap != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
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
            int result = this.description.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.contentType != null ? this.contentType.hashCode() : 0);
            result = 31 * result + (this.createdAt != null ? this.createdAt.hashCode() : 0);
            result = 31 * result + (this.createdBy != null ? this.createdBy.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isLocked != null ? this.isLocked.hashCode() : 0);
            result = 31 * result + (this.isMutable != null ? this.isMutable.hashCode() : 0);
            result = 31 * result + (this.isSystem != null ? this.isSystem.hashCode() : 0);
            result = 31 * result + (this.modifiedAt != null ? this.modifiedAt.hashCode() : 0);
            result = 31 * result + (this.modifiedBy != null ? this.modifiedBy.hashCode() : 0);
            result = 31 * result + (this.parentId != null ? this.parentId.hashCode() : 0);
            result = 31 * result + (this.postRequestMap != null ? this.postRequestMap.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
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
