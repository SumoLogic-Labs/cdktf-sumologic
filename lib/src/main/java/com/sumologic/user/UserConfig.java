package com.sumologic.user;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.224Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.user.UserConfig")
@software.amazon.jsii.Jsii.Proxy(UserConfig.Jsii$Proxy.class)
public interface UserConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#email User#email}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEmail();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#first_name User#first_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFirstName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#is_active User#is_active}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getIsActive();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#last_name User#last_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLastName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#role_ids User#role_ids}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRoleIds();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#transfer_to User#transfer_to}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTransferTo();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#id User#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link UserConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link UserConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<UserConfig> {
        java.lang.String email;
        java.lang.String firstName;
        java.lang.Object isActive;
        java.lang.String lastName;
        java.util.List<java.lang.String> roleIds;
        java.lang.String transferTo;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link UserConfig#getEmail}
         * @param email Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#email User#email}. This parameter is required.
         * @return {@code this}
         */
        public Builder email(java.lang.String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getFirstName}
         * @param firstName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#first_name User#first_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder firstName(java.lang.String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getIsActive}
         * @param isActive Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#is_active User#is_active}. This parameter is required.
         * @return {@code this}
         */
        public Builder isActive(java.lang.Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getIsActive}
         * @param isActive Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#is_active User#is_active}. This parameter is required.
         * @return {@code this}
         */
        public Builder isActive(com.hashicorp.cdktf.IResolvable isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getLastName}
         * @param lastName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#last_name User#last_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder lastName(java.lang.String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getRoleIds}
         * @param roleIds Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#role_ids User#role_ids}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleIds(java.util.List<java.lang.String> roleIds) {
            this.roleIds = roleIds;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getTransferTo}
         * @param transferTo Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#transfer_to User#transfer_to}. This parameter is required.
         * @return {@code this}
         */
        public Builder transferTo(java.lang.String transferTo) {
            this.transferTo = transferTo;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/user#id User#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getDependsOn}
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
         * Sets the value of {@link UserConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link UserConfig#getProvisioners}
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
         * @return a new instance of {@link UserConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public UserConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link UserConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements UserConfig {
        private final java.lang.String email;
        private final java.lang.String firstName;
        private final java.lang.Object isActive;
        private final java.lang.String lastName;
        private final java.util.List<java.lang.String> roleIds;
        private final java.lang.String transferTo;
        private final java.lang.String id;
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
            this.email = software.amazon.jsii.Kernel.get(this, "email", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.firstName = software.amazon.jsii.Kernel.get(this, "firstName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isActive = software.amazon.jsii.Kernel.get(this, "isActive", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.lastName = software.amazon.jsii.Kernel.get(this, "lastName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleIds = software.amazon.jsii.Kernel.get(this, "roleIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.transferTo = software.amazon.jsii.Kernel.get(this, "transferTo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.email = java.util.Objects.requireNonNull(builder.email, "email is required");
            this.firstName = java.util.Objects.requireNonNull(builder.firstName, "firstName is required");
            this.isActive = java.util.Objects.requireNonNull(builder.isActive, "isActive is required");
            this.lastName = java.util.Objects.requireNonNull(builder.lastName, "lastName is required");
            this.roleIds = java.util.Objects.requireNonNull(builder.roleIds, "roleIds is required");
            this.transferTo = java.util.Objects.requireNonNull(builder.transferTo, "transferTo is required");
            this.id = builder.id;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getEmail() {
            return this.email;
        }

        @Override
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        @Override
        public final java.lang.Object getIsActive() {
            return this.isActive;
        }

        @Override
        public final java.lang.String getLastName() {
            return this.lastName;
        }

        @Override
        public final java.util.List<java.lang.String> getRoleIds() {
            return this.roleIds;
        }

        @Override
        public final java.lang.String getTransferTo() {
            return this.transferTo;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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

            data.set("email", om.valueToTree(this.getEmail()));
            data.set("firstName", om.valueToTree(this.getFirstName()));
            data.set("isActive", om.valueToTree(this.getIsActive()));
            data.set("lastName", om.valueToTree(this.getLastName()));
            data.set("roleIds", om.valueToTree(this.getRoleIds()));
            data.set("transferTo", om.valueToTree(this.getTransferTo()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
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
            struct.set("fqn", om.valueToTree("sumologic.user.UserConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            UserConfig.Jsii$Proxy that = (UserConfig.Jsii$Proxy) o;

            if (!email.equals(that.email)) return false;
            if (!firstName.equals(that.firstName)) return false;
            if (!isActive.equals(that.isActive)) return false;
            if (!lastName.equals(that.lastName)) return false;
            if (!roleIds.equals(that.roleIds)) return false;
            if (!transferTo.equals(that.transferTo)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
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
            int result = this.email.hashCode();
            result = 31 * result + (this.firstName.hashCode());
            result = 31 * result + (this.isActive.hashCode());
            result = 31 * result + (this.lastName.hashCode());
            result = 31 * result + (this.roleIds.hashCode());
            result = 31 * result + (this.transferTo.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
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
