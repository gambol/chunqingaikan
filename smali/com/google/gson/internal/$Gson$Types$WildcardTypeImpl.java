package com.google.gson.internal; class $Gson$Types$WildcardTypeImpl { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "$Gson$Types.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// .implements Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/$Gson$Types;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "WildcardTypeImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;// .field private final upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
a=0;//     .locals 4
a=0;//     .param p1, "upperBounds"    # [Ljava/lang/reflect/Type;
a=0;//     .param p2, "lowerBounds"    # [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 534
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 535
a=0;//     #p0=(Reference,Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;);
a=0;//     array-length v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 536
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 538
a=0;//     array-length v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 539
a=0;//     aget-object v0, p2, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 540
a=0;//     aget-object v0, p2, v2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->access$000(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     .line 541
a=0;//     aget-object v0, p1, v2
a=0;// 
a=0;//     const-class v3, Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 542
a=0;//     aget-object v0, p2, v2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 543
a=0;//     const-class v0, Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 551
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);v3=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 535
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 536
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 541
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 546
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(One);v3=(Uninit);
a=0;//     aget-object v0, p1, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 547
a=0;//     aget-object v0, p1, v2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->access$000(Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     .line 548
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 549
a=0;//     aget-object v0, p1, v2
a=0;// 
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "other"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     instance-of v0, p1, Ljava/lang/reflect/WildcardType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/reflect/WildcardType;
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
a=0;// .method public getLowerBounds()[Ljava/lang/reflect/Type;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lcom/google/gson/internal/$Gson$Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getUpperBounds()[Ljava/lang/reflect/Type;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1f
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1f
a=0;// 
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 574
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "? super "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->lowerBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 578
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 575
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 576
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 578
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "? extends "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$WildcardTypeImpl;->upperBound:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
