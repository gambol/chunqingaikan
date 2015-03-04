package com.google.gson.internal; class ConstructorConstructor { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/ConstructorConstructor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConstructorConstructor.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final instanceCreators:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/InstanceCreator",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/util/Map;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/InstanceCreator",
a=0;//             "<*>;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p1, "instanceCreators":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/Type;Lcom/google/gson/InstanceCreator<*>;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/google/gson/internal/ConstructorConstructor;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/ConstructorConstructor;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private newDefaultConstructor(Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<-TT;>;)",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     .local p1, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<-TT;>;"
a=0;//     #v0=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->isAccessible()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     new-instance v2, Lcom/google/gson/internal/ConstructorConstructor$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$3;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/google/gson/internal/ConstructorConstructor$3;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/reflect/Constructor;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<-TT;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/google/gson/internal/ConstructorConstructor$3;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 118
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private newDefaultImplementationConstructor(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .locals 3
a=0;//     .param p1, "type"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<-TT;>;)",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     .local p2, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     const-class v0, Ljava/util/Collection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 131
a=0;//     const-class v0, Ljava/util/SortedSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$4;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$4;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     .line 197
a=0;//     .end local p1    # "type":Ljava/lang/reflect/Type;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 137
a=0;//     .restart local p1    # "type":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const-class v0, Ljava/util/EnumSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$5;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/google/gson/internal/ConstructorConstructor$5;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$5;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$6;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$6;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$6;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$6;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$7;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$7;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$7;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$7;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$8;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$8;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$8;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$8;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 175
a=0;//     const-class v0, Ljava/util/SortedMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$9;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$9;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$9;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$9;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-class v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     check-cast p1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local p1    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$10;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$10;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$10;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$10;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$11;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$11;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/ConstructorConstructor$11;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$11;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     .restart local p1    # "type":Ljava/lang/reflect/Type;
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private newUnsafeAllocator(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .locals 1
a=0;//     .param p1, "type"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<-TT;>;)",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     .local p2, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$12;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$12;);
a=0;//     invoke-direct {v0, p0, p2, p1}, Lcom/google/gson/internal/ConstructorConstructor$12;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$12;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     .local p1, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 53
a=0;//     .local v4, "type":Ljava/lang/reflect/Type;
a=0;//     #v4=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 58
a=0;//     .local v2, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v6, p0, Lcom/google/gson/internal/ConstructorConstructor;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/google/gson/InstanceCreator;
a=0;// 
a=0;//     .line 59
a=0;//     .local v5, "typeCreator":Lcom/google/gson/InstanceCreator;, "Lcom/google/gson/InstanceCreator<TT;>;"
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$1;);
a=0;//     invoke-direct {v0, p0, v5, v4}, Lcom/google/gson/internal/ConstructorConstructor$1;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/InstanceCreator;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v6, p0, Lcom/google/gson/internal/ConstructorConstructor;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/google/gson/InstanceCreator;
a=0;// 
a=0;//     .line 71
a=0;//     .local v3, "rawTypeCreator":Lcom/google/gson/InstanceCreator;, "Lcom/google/gson/InstanceCreator<TT;>;"
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/google/gson/internal/ConstructorConstructor$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor$2;);
a=0;//     invoke-direct {v0, p0, v3, v4}, Lcom/google/gson/internal/ConstructorConstructor$2;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/InstanceCreator;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$2;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/internal/ConstructorConstructor;->newDefaultConstructor(Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     .local v0, "defaultConstructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ObjectConstructor;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     invoke-direct {p0, v4, v2}, Lcom/google/gson/internal/ConstructorConstructor;->newDefaultImplementationConstructor(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 85
a=0;//     .local v1, "defaultImplementation":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/ObjectConstructor;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 86
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_3
a=0;//     invoke-direct {p0, v4, v2}, Lcom/google/gson/internal/ConstructorConstructor;->newUnsafeAllocator(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/ConstructorConstructor;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
