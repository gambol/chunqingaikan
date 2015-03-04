package com.google.gson.internal; class $Gson$Types$ParameterizedTypeImpl { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "$Gson$Types.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// .implements Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/$Gson$Types;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "ParameterizedTypeImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final ownerType:Ljava/lang/reflect/Type;
a=0;// 
a=0;// .field private final rawType:Ljava/lang/reflect/Type;
a=0;// 
a=0;// .field private final typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;//     .locals 5
a=0;//     .param p1, "ownerType"    # Ljava/lang/reflect/Type;
a=0;//     .param p2, "rawType"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "typeArguments"    # [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 439
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 441
a=0;//     #p0=(Reference,Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;);
a=0;//     instance-of v2, p2, Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .line 442
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 443
a=0;//     .local v0, "rawTypeAsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move v2, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 444
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v3}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 447
a=0;//     .end local v0    # "rawTypeAsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     if-nez p1, :cond_5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     iput-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->ownerType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 448
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->rawType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {p3}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 450
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "t":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_6
a=0;// 
a=0;//     .line 451
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v2, v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 452
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v2, v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Types;->access$000(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v3, v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     .line 450
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v1    # "t":I
a=0;//     .restart local v0    # "rawTypeAsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/Class;);v1=(Uninit);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 443
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 447
a=0;//     .end local v0    # "rawTypeAsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 455
a=0;//     .restart local v1    # "t":I
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "other"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local p1    # "other":Ljava/lang/Object;
a=0;//     invoke-static {p0, p1}, Lcom/google/gson/internal/$Gson$Types;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v0}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getOwnerType()Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->ownerType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRawType()Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->rawType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->rawType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->ownerType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Types;->access$100(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x1e
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 482
a=0;//     .local v1, "stringBuilder":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->rawType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 484
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 492
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 488
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v2, "<"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 489
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 490
a=0;//     const-string v2, ", "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;->typeArguments:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     aget-object v3, v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 489
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 492
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v2, ">"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
