package com.j256.ormlite.dao; class LruObjectCache$LimitedLinkedHashMap { void a() { int a;
a=0;// .class Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;
a=0;// .super Ljava/util/LinkedHashMap;
a=0;// .source "LruObjectCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/dao/LruObjectCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "LimitedLinkedHashMap"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/util/LinkedHashMap",
a=0;//         "<TK;TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J = -0x3f5f911838d317f4L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final capacity:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "capacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;, "Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap<TK;TV;>;"
a=0;//     const/high16 v0, 0x3f400000    # 0.75f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     .line 128
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;);
a=0;//     iput p1, p0, Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;->capacity:I
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;, "Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap<TK;TV;>;"
a=0;//     .local p1, "eldest":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;->capacity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
