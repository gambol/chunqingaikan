package com.google.gson.internal; class $Gson$Types { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/$Gson$Types;
a=0;// .super Ljava/lang/Object;
a=0;// .source "$Gson$Types.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;,
a=0;//         Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;,
a=0;//         Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     sput-object v0, Lcom/google/gson/internal/$Gson$Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/$Gson$Types;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Ljava/lang/reflect/Type;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {p0}, Lcom/google/gson/internal/$Gson$Types;->checkNotPrimitive(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {p0}, Lcom/google/gson/internal/$Gson$Types;->hashCodeOrZero(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static arrayOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
a=0;//     .locals 1
a=0;//     .param p0, "componentType"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;//     .locals 7
a=0;//     .param p0, "type"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     instance-of v4, p0, Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     new-instance v4, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v5}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     move-object v0, v4
a=0;// 
a=0;//     .line 112
a=0;//     .end local v0    # "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 98
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 99
a=0;//     .local v2, "p":Ljava/lang/reflect/ParameterizedType;
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;);
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-direct {v0, v4, v5, v6}, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     .end local v2    # "p":Ljava/lang/reflect/ParameterizedType;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 103
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v1, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "g":Ljava/lang/reflect/GenericArrayType;
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-direct {v0, v4}, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v1    # "g":Ljava/lang/reflect/GenericArrayType;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Boolean);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     move-object v3, p0
a=0;// 
a=0;//     .line 107
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v3, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .line 108
a=0;//     .local v3, "w":Ljava/lang/reflect/WildcardType;
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-direct {v0, v4, v5}, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v3    # "w":Ljava/lang/reflect/WildcardType;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static checkNotPrimitive(Ljava/lang/reflect/Type;)V
a=0;//     .locals 1
a=0;//     .param p0, "type"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     instance-of v0, p0, Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p0, Ljava/lang/Class;
a=0;// 
a=0;//     .end local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 432
a=0;//     return-void
a=0;// 
a=0;//     .line 431
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/TypeVariable",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     .local p0, "typeVariable":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 425
a=0;//     .local v0, "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
a=0;//     #v0=(Reference,Ljava/lang/reflect/GenericDeclaration;);
a=0;//     instance-of v1, v0, Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .end local v0    # "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "a"    # Ljava/lang/Object;
a=0;//     .param p1, "b"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     if-eq p0, p1, :cond_0
a=0;// 
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
a=0;//     .locals 12
a=0;//     .param p0, "a"    # Ljava/lang/reflect/Type;
a=0;//     .param p1, "b"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     #v9=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     move v9, v8
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Boolean);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v9
a=0;// 
a=0;//     .line 162
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(One);v9=(Null);v10=(Uninit);v11=(Uninit);
a=0;//     instance-of v10, p0, Ljava/lang/Class;
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v9=(Null);
a=0;//     instance-of v10, p0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 167
a=0;//     instance-of v10, p1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 172
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .local v2, "pa":Ljava/lang/reflect/ParameterizedType;
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 173
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v3, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 174
a=0;//     .local v3, "pb":Ljava/lang/reflect/ParameterizedType;
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v10, v11}, Lcom/google/gson/internal/$Gson$Types;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v8=(Boolean);
a=0;//     move v9, v8
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(One);v9=(Null);
a=0;//     move v8, v9
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 178
a=0;//     .end local v2    # "pa":Ljava/lang/reflect/ParameterizedType;
a=0;//     .end local v3    # "pb":Ljava/lang/reflect/ParameterizedType;
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v3=(Uninit);v8=(One);v11=(Uninit);
a=0;//     instance-of v10, p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 179
a=0;//     instance-of v8, p1, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .local v0, "ga":Ljava/lang/reflect/GenericArrayType;
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 184
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v1, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .line 185
a=0;//     .local v1, "gb":Ljava/lang/reflect/GenericArrayType;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v8, v9}, Lcom/google/gson/internal/$Gson$Types;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     .end local v0    # "ga":Ljava/lang/reflect/GenericArrayType;
a=0;//     .end local v1    # "gb":Ljava/lang/reflect/GenericArrayType;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v8=(One);v9=(Null);
a=0;//     instance-of v10, p0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     .line 188
a=0;//     instance-of v10, p1, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     move-object v6, p0
a=0;// 
a=0;//     .line 192
a=0;//     #v6=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v6, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .local v6, "wa":Ljava/lang/reflect/WildcardType;
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 193
a=0;//     #v7=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v7, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .line 194
a=0;//     .local v7, "wb":Ljava/lang/reflect/WildcardType;
a=0;//     invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v7}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_6
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v7}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_6
a=0;// 
a=0;//     :goto_2
a=0;//     #v8=(Boolean);
a=0;//     move v9, v8
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v8=(One);v9=(Null);
a=0;//     move v8, v9
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 197
a=0;//     .end local v6    # "wa":Ljava/lang/reflect/WildcardType;
a=0;//     .end local v7    # "wb":Ljava/lang/reflect/WildcardType;
a=0;//     :cond_7
a=0;//     #v6=(Uninit);v7=(Uninit);v8=(One);v11=(Uninit);
a=0;//     instance-of v10, p0, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     instance-of v10, p1, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     .line 201
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v4, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     .local v4, "va":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     move-object v5, p1
a=0;// 
a=0;//     .line 202
a=0;//     #v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v5, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     .line 203
a=0;//     .local v5, "vb":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/reflect/GenericDeclaration;);
a=0;//     invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/reflect/GenericDeclaration;);
a=0;//     if-ne v10, v11, :cond_8
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_8
a=0;// 
a=0;//     :goto_3
a=0;//     #v8=(Boolean);v10=(Conflicted);
a=0;//     move v9, v8
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v8=(One);v9=(Null);
a=0;//     move v8, v9
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static getArrayComponentType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;//     .param p0, "array"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .end local p0    # "array":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p0    # "array":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     check-cast p0, Ljava/lang/Class;
a=0;// 
a=0;//     .end local p0    # "array":Ljava/lang/reflect/Type;
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCollectionElementType(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "contextRawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     #v2=(Null);
a=0;//     const-class v1, Ljava/util/Collection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p0, p1, v1}, Lcom/google/gson/internal/$Gson$Types;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 289
a=0;//     .local v0, "collectionType":Ljava/lang/reflect/Type;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v1, v0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     check-cast v0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .end local v0    # "collectionType":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 292
a=0;//     .restart local v0    # "collectionType":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     check-cast v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v0    # "collectionType":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     .line 295
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .restart local v0    # "collectionType":Ljava/lang/reflect/Type;
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     const-class v1, Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     .local p1, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p2, "toResolve":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     if-ne p2, p1, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     .end local p0    # "context":Ljava/lang/reflect/Type;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 231
a=0;//     .restart local p0    # "context":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "interfaces":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     .local v2, "length":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     .line 234
a=0;//     aget-object v4, v1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-ne v4, p2, :cond_1
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object p0, v4, v0
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_1
a=0;//     #v4=(Null);p0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     aget-object v4, v1, v0
a=0;// 
a=0;//     invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v4, v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v5, v1, v0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v5, p2}, Lcom/google/gson/internal/$Gson$Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_2
a=0;//     #v4=(Boolean);v5=(Uninit);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 243
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "interfaces":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     .end local v2    # "length":I
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 244
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     const-class v4, Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     if-eq p1, v4, :cond_6
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 246
a=0;//     .local v3, "rawSupertype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v3, p2, :cond_4
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_4
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v4, v3, p2}, Lcom/google/gson/internal/$Gson$Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     move-object p1, v3
a=0;// 
a=0;//     .line 252
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v3    # "rawSupertype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object p0, p2
a=0;// 
a=0;//     .line 256
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getMapKeyAndValueTypes(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)[",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "contextRawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 308
a=0;//     #v4=(Null);
a=0;//     const-class v2, Ljava/util/Properties;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-ne p0, v2, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     new-array v2, v3, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     const-class v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     const-class v3, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     .line 318
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 312
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(PosByte);
a=0;//     const-class v2, Ljava/util/Map;
a=0;// 
a=0;//     invoke-static {p0, p1, v2}, Lcom/google/gson/internal/$Gson$Types;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 314
a=0;//     .local v1, "mapType":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 315
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 316
a=0;//     .local v0, "mapParameterizedType":Ljava/lang/reflect/ParameterizedType;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 318
a=0;//     .end local v0    # "mapParameterizedType":Ljava/lang/reflect/ParameterizedType;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Boolean);
a=0;//     new-array v2, v3, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const-class v3, Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     const-class v3, Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;//     .locals 7
a=0;//     .param p0, "type"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     #v5=(Null);
a=0;//     instance-of v4, p0, Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     check-cast p0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 141
a=0;//     .end local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 121
a=0;//     .restart local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 122
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v2, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 127
a=0;//     .local v2, "parameterizedType":Ljava/lang/reflect/ParameterizedType;
a=0;//     invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     .local v3, "rawType":Ljava/lang/reflect/Type;
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v4, v3, Ljava/lang/Class;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 129
a=0;//     check-cast v3, Ljava/lang/Class;
a=0;// 
a=0;//     .end local v3    # "rawType":Ljava/lang/reflect/Type;
a=0;//     move-object p0, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     .end local v2    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     check-cast p0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .end local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "componentType":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     .end local v1    # "componentType":Ljava/lang/reflect/Type;
a=0;//     .restart local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Boolean);
a=0;//     instance-of v4, p0, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 138
a=0;//     const-class p0, Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_3
a=0;//     instance-of v4, p0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 141
a=0;//     check-cast p0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .end local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     .restart local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     if-nez p0, :cond_5
a=0;// 
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "className":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Expected a Class, ParameterizedType, or GenericArrayType, but <"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "> is of type "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 144
a=0;//     .end local v0    # "className":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v4=(Boolean);v5=(Null);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     .local p1, "contextRawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p2, "supertype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {p0, p1, p2}, Lcom/google/gson/internal/$Gson$Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {p0, p1, v0}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static hashCodeOrZero(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;//     .param p0, "array"    # [Ljava/lang/Object;
a=0;//     .param p1, "toFind"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 412
a=0;//     aget-object v1, p0, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     return v0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 416
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static varargs newParameterizedTypeWithOwner(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
a=0;//     .locals 1
a=0;//     .param p0, "ownerType"    # Ljava/lang/reflect/Type;
a=0;//     .param p1, "rawType"    # Ljava/lang/reflect/Type;
a=0;//     .param p2, "typeArguments"    # [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;//     .locals 21
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .param p2, "toResolve"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     .local p1, "contextRawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_2
a=0;// 
a=0;//     move-object/from16 v17, p2
a=0;// 
a=0;//     .line 325
a=0;//     #v17=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v17, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     .line 326
a=0;//     .local v17, "typeVariable":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v2, v17
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/TypeVariable;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types;->resolveTypeVariable(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 327
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v10, p2
a=0;// 
a=0;//     .line 388
a=0;//     .end local v17    # "typeVariable":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ujava/lang/Object;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 331
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Boolean);v20=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_4
a=0;// 
a=0;//     move-object/from16 v19, p2
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v19, Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_4
a=0;// 
a=0;//     move-object/from16 v11, p2
a=0;// 
a=0;//     .line 332
a=0;//     #v11=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v11, Ljava/lang/Class;
a=0;// 
a=0;//     .line 333
a=0;//     .local v11, "original":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {v11}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 334
a=0;//     .local v5, "componentType":Ljava/lang/reflect/Type;
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v1, v5}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 335
a=0;//     .local v8, "newComponentType":Ljava/lang/reflect/Type;
a=0;//     #v8=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-ne v5, v8, :cond_3
a=0;// 
a=0;//     .end local v11    # "original":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_1
a=0;//     move-object v10, v11
a=0;// 
a=0;//     #v10=(Reference,Ujava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v11    # "original":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_3
a=0;//     #v10=(Uninit);
a=0;//     invoke-static {v8}, Lcom/google/gson/internal/$Gson$Types;->arrayOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 339
a=0;//     .end local v5    # "componentType":Ljava/lang/reflect/Type;
a=0;//     .end local v8    # "newComponentType":Ljava/lang/reflect/Type;
a=0;//     .end local v11    # "original":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Uninit);v8=(Uninit);v11=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_5
a=0;// 
a=0;//     move-object/from16 v10, p2
a=0;// 
a=0;//     .line 340
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v10, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .line 341
a=0;//     .local v10, "original":Ljava/lang/reflect/GenericArrayType;
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 342
a=0;//     .restart local v5    # "componentType":Ljava/lang/reflect/Type;
a=0;//     #v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v1, v5}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 343
a=0;//     .restart local v8    # "newComponentType":Ljava/lang/reflect/Type;
a=0;//     #v8=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eq v5, v8, :cond_1
a=0;// 
a=0;//     invoke-static {v8}, Lcom/google/gson/internal/$Gson$Types;->arrayOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 347
a=0;//     .end local v5    # "componentType":Ljava/lang/reflect/Type;
a=0;//     .end local v8    # "newComponentType":Ljava/lang/reflect/Type;
a=0;//     .end local v10    # "original":Ljava/lang/reflect/GenericArrayType;
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Uninit);v8=(Uninit);v10=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_a
a=0;// 
a=0;//     move-object/from16 v10, p2
a=0;// 
a=0;//     .line 348
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v10, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .line 349
a=0;//     .local v10, "original":Ljava/lang/reflect/ParameterizedType;
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 350
a=0;//     .local v14, "ownerType":Ljava/lang/reflect/Type;
a=0;//     #v14=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v1, v14}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 351
a=0;//     .local v9, "newOwnerType":Ljava/lang/reflect/Type;
a=0;//     #v9=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eq v9, v14, :cond_8
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 353
a=0;//     .local v4, "changed":Z
a=0;//     :goto_2
a=0;//     #v4=(Boolean);
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 354
a=0;//     .local v3, "args":[Ljava/lang/reflect/Type;
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .local v16, "t":I
a=0;//     #v16=(Null);
a=0;//     array-length v6, v3
a=0;// 
a=0;//     .local v6, "length":I
a=0;//     :goto_3
a=0;//     #v6=(Integer);v15=(Conflicted);v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v6, :cond_9
a=0;// 
a=0;//     .line 355
a=0;//     aget-object v19, v3, v16
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 356
a=0;//     .local v15, "resolvedTypeArgument":Ljava/lang/reflect/Type;
a=0;//     #v15=(Reference,Ljava/lang/reflect/Type;);
a=0;//     aget-object v19, v3, v16
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eq v15, v0, :cond_7
a=0;// 
a=0;//     .line 357
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {v3}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "args":[Ljava/lang/reflect/Type;
a=0;//     check-cast v3, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 359
a=0;//     .restart local v3    # "args":[Ljava/lang/reflect/Type;
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 361
a=0;//     :cond_6
a=0;//     aput-object v15, v3, v16
a=0;// 
a=0;//     .line 354
a=0;//     :cond_7
a=0;//     add-int/lit8 v16, v16, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 351
a=0;//     .end local v3    # "args":[Ljava/lang/reflect/Type;
a=0;//     .end local v4    # "changed":Z
a=0;//     .end local v6    # "length":I
a=0;//     .end local v15    # "resolvedTypeArgument":Ljava/lang/reflect/Type;
a=0;//     .end local v16    # "t":I
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v6=(Uninit);v15=(Uninit);v16=(Uninit);v19=(Boolean);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 365
a=0;//     .restart local v3    # "args":[Ljava/lang/reflect/Type;
a=0;//     .restart local v4    # "changed":Z
a=0;//     .restart local v6    # "length":I
a=0;//     .restart local v16    # "t":I
a=0;//     :cond_9
a=0;//     #v0=(Integer);v3=(Reference,[Ljava/lang/reflect/Type;);v4=(Boolean);v6=(Integer);v15=(Conflicted);v16=(Integer);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v9, v0, v3}, Lcom/google/gson/internal/$Gson$Types;->newParameterizedTypeWithOwner(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     .end local v3    # "args":[Ljava/lang/reflect/Type;
a=0;//     .end local v4    # "changed":Z
a=0;//     .end local v6    # "length":I
a=0;//     .end local v9    # "newOwnerType":Ljava/lang/reflect/Type;
a=0;//     .end local v10    # "original":Ljava/lang/reflect/ParameterizedType;
a=0;//     .end local v14    # "ownerType":Ljava/lang/reflect/Type;
a=0;//     .end local v16    # "t":I
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Uninit);v4=(Uninit);v6=(Uninit);v9=(Uninit);v10=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v19=(Boolean);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v0, v0, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     if-eqz v19, :cond_c
a=0;// 
a=0;//     move-object/from16 v10, p2
a=0;// 
a=0;//     .line 370
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v10, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     .line 371
a=0;//     .local v10, "original":Ljava/lang/reflect/WildcardType;
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 372
a=0;//     .local v12, "originalLowerBound":[Ljava/lang/reflect/Type;
a=0;//     #v12=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-interface {v10}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 374
a=0;//     .local v13, "originalUpperBound":[Ljava/lang/reflect/Type;
a=0;//     #v13=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     .line 375
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     aget-object v19, v12, v19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 376
a=0;//     .local v7, "lowerBound":Ljava/lang/reflect/Type;
a=0;//     #v7=(Reference,Ljava/lang/reflect/Type;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     aget-object v19, v12, v19
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eq v7, v0, :cond_1
a=0;// 
a=0;//     .line 377
a=0;//     invoke-static {v7}, Lcom/google/gson/internal/$Gson$Types;->supertypeOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 379
a=0;//     .end local v7    # "lowerBound":Ljava/lang/reflect/Type;
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(One);v2=(Conflicted);v7=(Uninit);v19=(Integer);
a=0;//     array-length v0, v13
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 380
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     aget-object v19, v13, v19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 381
a=0;//     .local v18, "upperBound":Ljava/lang/reflect/Type;
a=0;//     #v18=(Reference,Ljava/lang/reflect/Type;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     aget-object v19, v13, v19
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 382
a=0;//     invoke-static/range {v18 .. v18}, Lcom/google/gson/internal/$Gson$Types;->subtypeOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .end local v10    # "original":Ljava/lang/reflect/WildcardType;
a=0;//     .end local v12    # "originalLowerBound":[Ljava/lang/reflect/Type;
a=0;//     .end local v13    # "originalUpperBound":[Ljava/lang/reflect/Type;
a=0;//     .end local v18    # "upperBound":Ljava/lang/reflect/Type;
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v10=(Uninit);v12=(Uninit);v13=(Uninit);v18=(Uninit);v19=(Boolean);v20=(Uninit);
a=0;//     move-object/from16 v10, p2
a=0;// 
a=0;//     .line 388
a=0;//     #v10=(Reference,Ljava/lang/reflect/Type;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static resolveTypeVariable(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/reflect/TypeVariable",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/reflect/Type;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     .local p1, "contextRawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p2, "unknown":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/$Gson$Types;->declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 397
a=0;//     .local v1, "declaredByRaw":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     .end local p2    # "unknown":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 401
a=0;//     .restart local p2    # "unknown":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p0, p1, v1}, Lcom/google/gson/internal/$Gson$Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 402
a=0;//     .local v0, "declaredBy":Ljava/lang/reflect/Type;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/reflect/TypeVariable;);
a=0;//     invoke-static {v3, p2}, Lcom/google/gson/internal/$Gson$Types;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 404
a=0;//     .local v2, "index":I
a=0;//     #v2=(Integer);
a=0;//     check-cast v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v0    # "declaredBy":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aget-object p2, v3, v2
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static subtypeOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
a=0;//     .locals 3
a=0;//     .param p0, "bound"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v1, v2
a=0;// 
a=0;//     sget-object v2, Lcom/google/gson/internal/$Gson$Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static supertypeOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
a=0;//     .locals 5
a=0;//     .param p0, "bound"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     new-array v1, v4, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const-class v2, Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v1, v3
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     aput-object p0, v2, v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "type"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     instance-of v0, p0, Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p0, Ljava/lang/Class;
a=0;// 
a=0;//     .end local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local p0    # "type":Ljava/lang/reflect/Type;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
