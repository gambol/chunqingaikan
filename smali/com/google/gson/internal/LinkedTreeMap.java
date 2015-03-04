package com.google.gson.internal; class LinkedTreeMap { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/LinkedTreeMap;
a=0;// .super Ljava/util/AbstractMap;
a=0;// .source "LinkedTreeMap.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/LinkedTreeMap$KeySet;,
a=0;//         Lcom/google/gson/internal/LinkedTreeMap$EntrySet;,
a=0;//         Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;,
a=0;//         Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/util/AbstractMap",
a=0;//         "<TK;TV;>;",
a=0;//         "Ljava/io/Serializable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic $assertionsDisabled:Z
a=0;// 
a=0;// .field private static final NATURAL_ORDER:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<",
a=0;//             "Ljava/lang/Comparable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field comparator:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<-TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private entrySet:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap",
a=0;//             "<TK;TV;>.EntrySet;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private keySet:Lcom/google/gson/internal/LinkedTreeMap$KeySet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap",
a=0;//             "<TK;TV;>.KeySet;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field modCount:I
a=0;// 
a=0;// .field root:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field size:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     const-class v0, Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/google/gson/internal/LinkedTreeMap;->$assertionsDisabled:Z
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/LinkedTreeMap$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/LinkedTreeMap;->NATURAL_ORDER:Ljava/util/Comparator;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     sget-object v0, Lcom/google/gson/internal/LinkedTreeMap;->NATURAL_ORDER:Ljava/util/Comparator;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/LinkedTreeMap;-><init>(Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/Comparator;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Comparator",
a=0;//             "<-TK;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<-TK;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     .line 49
a=0;//     iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 72
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .end local p1    # "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<-TK;>;"
a=0;//     :goto_0
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->comparator:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 72
a=0;//     .restart local p1    # "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<-TK;>;"
a=0;//     :cond_0
a=0;//     sget-object p1, Lcom/google/gson/internal/LinkedTreeMap;->NATURAL_ORDER:Ljava/util/Comparator;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "a"    # Ljava/lang/Object;
a=0;//     .param p2, "b"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     if-eq p1, p2, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
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
a=0;// .method private rebalance(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;//     .locals 18
a=0;//     .param p2, "insert"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;Z)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "unbalanced":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     move-object/from16 v9, p1
a=0;// 
a=0;//     .local v9, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v2, v9, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 313
a=0;//     .local v2, "left":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v2=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v10, v9, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 314
a=0;//     .local v10, "right":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v10=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget v4, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 315
a=0;//     .local v4, "leftHeight":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     iget v12, v10, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 317
a=0;//     .local v12, "rightHeight":I
a=0;//     :goto_2
a=0;//     #v12=(Integer);
a=0;//     sub-int v1, v4, v12
a=0;// 
a=0;//     .line 318
a=0;//     .local v1, "delta":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v17, -0x2
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v1, v0, :cond_8
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v13, v10, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 320
a=0;//     .local v13, "rightLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v13=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v15, v10, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 321
a=0;//     .local v15, "rightRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v15=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     iget v0, v15, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 322
a=0;//     .local v16, "rightRightHeight":I
a=0;//     :goto_3
a=0;//     #v16=(Integer);
a=0;//     if-eqz v13, :cond_5
a=0;// 
a=0;//     iget v14, v13, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 324
a=0;//     .local v14, "rightLeftHeight":I
a=0;//     :goto_4
a=0;//     #v14=(Integer);
a=0;//     sub-int v11, v14, v16
a=0;// 
a=0;//     .line 325
a=0;//     .local v11, "rightDelta":I
a=0;//     #v11=(Integer);
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v11, v0, :cond_0
a=0;// 
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     if-nez p2, :cond_6
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-direct {v0, v9}, Lcom/google/gson/internal/LinkedTreeMap;->rotateLeft(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 332
a=0;//     :goto_5
a=0;//     if-eqz p2, :cond_a
a=0;// 
a=0;//     .line 368
a=0;//     .end local v1    # "delta":I
a=0;//     .end local v2    # "left":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v4    # "leftHeight":I
a=0;//     .end local v10    # "right":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v11    # "rightDelta":I
a=0;//     .end local v12    # "rightHeight":I
a=0;//     .end local v13    # "rightLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v14    # "rightLeftHeight":I
a=0;//     .end local v15    # "rightRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v16    # "rightRightHeight":I
a=0;//     :cond_1
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 314
a=0;//     .restart local v2    # "left":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .restart local v10    # "right":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_2
a=0;//     #v2=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v10=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 315
a=0;//     .restart local v4    # "leftHeight":I
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 321
a=0;//     .restart local v1    # "delta":I
a=0;//     .restart local v12    # "rightHeight":I
a=0;//     .restart local v13    # "rightLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .restart local v15    # "rightRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(Integer);v12=(Integer);v13=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v15=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v17=(Byte);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 322
a=0;//     .restart local v16    # "rightRightHeight":I
a=0;//     :cond_5
a=0;//     #v0=(Integer);v16=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 328
a=0;//     .restart local v11    # "rightDelta":I
a=0;//     .restart local v14    # "rightLeftHeight":I
a=0;//     :cond_6
a=0;//     #v0=(Byte);v11=(Integer);v14=(Integer);
a=0;//     sget-boolean v17, Lcom/google/gson/internal/LinkedTreeMap;->$assertionsDisabled:Z
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_7
a=0;// 
a=0;//     const/16 v17, 0x1
a=0;// 
a=0;//     #v17=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq v11, v0, :cond_7
a=0;// 
a=0;//     new-instance v17, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct/range {v17 .. v17}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 329
a=0;//     :cond_7
a=0;//     #v0=(Byte);v17=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-direct {v0, v10}, Lcom/google/gson/internal/LinkedTreeMap;->rotateRight(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 330
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v9}, Lcom/google/gson/internal/LinkedTreeMap;->rotateLeft(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 336
a=0;//     .end local v11    # "rightDelta":I
a=0;//     .end local v13    # "rightLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v14    # "rightLeftHeight":I
a=0;//     .end local v15    # "rightRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v16    # "rightRightHeight":I
a=0;//     :cond_8
a=0;//     #v0=(Byte);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Byte);
a=0;//     const/16 v17, 0x2
a=0;// 
a=0;//     #v17=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v1, v0, :cond_f
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v5, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 338
a=0;//     .local v5, "leftLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v5=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v7, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 339
a=0;//     .local v7, "leftRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     iget v8, v7, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 340
a=0;//     .local v8, "leftRightHeight":I
a=0;//     :goto_7
a=0;//     #v8=(Integer);
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     iget v6, v5, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 342
a=0;//     .local v6, "leftLeftHeight":I
a=0;//     :goto_8
a=0;//     #v6=(Integer);
a=0;//     sub-int v3, v6, v8
a=0;// 
a=0;//     .line 343
a=0;//     .local v3, "leftDelta":I
a=0;//     #v3=(Integer);
a=0;//     const/16 v17, 0x1
a=0;// 
a=0;//     #v17=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq v3, v0, :cond_9
a=0;// 
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     if-nez p2, :cond_d
a=0;// 
a=0;//     .line 344
a=0;//     :cond_9
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-direct {v0, v9}, Lcom/google/gson/internal/LinkedTreeMap;->rotateRight(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 350
a=0;//     :goto_9
a=0;//     #v17=(Byte);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 311
a=0;//     .end local v3    # "leftDelta":I
a=0;//     .end local v5    # "leftLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v6    # "leftLeftHeight":I
a=0;//     .end local v7    # "leftRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v8    # "leftRightHeight":I
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v17=(Integer);
a=0;//     iget-object v9, v9, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     .restart local v5    # "leftLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .restart local v7    # "leftRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_b
a=0;//     #v0=(PosByte);v5=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v17=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 340
a=0;//     .restart local v8    # "leftRightHeight":I
a=0;//     :cond_c
a=0;//     #v8=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 346
a=0;//     .restart local v3    # "leftDelta":I
a=0;//     .restart local v6    # "leftLeftHeight":I
a=0;//     :cond_d
a=0;//     #v0=(One);v3=(Integer);v6=(Integer);v17=(One);
a=0;//     sget-boolean v17, Lcom/google/gson/internal/LinkedTreeMap;->$assertionsDisabled:Z
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_e
a=0;// 
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v3, v0, :cond_e
a=0;// 
a=0;//     new-instance v17, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct/range {v17 .. v17}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 347
a=0;//     :cond_e
a=0;//     #v17=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-direct {v0, v2}, Lcom/google/gson/internal/LinkedTreeMap;->rotateLeft(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 348
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v9}, Lcom/google/gson/internal/LinkedTreeMap;->rotateRight(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 354
a=0;//     .end local v3    # "leftDelta":I
a=0;//     .end local v5    # "leftLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v6    # "leftLeftHeight":I
a=0;//     .end local v7    # "leftRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v8    # "leftRightHeight":I
a=0;//     :cond_f
a=0;//     #v0=(PosByte);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v17=(PosByte);
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     .line 355
a=0;//     add-int/lit8 v17, v4, 0x1
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v9, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 356
a=0;//     if-eqz p2, :cond_a
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 361
a=0;//     :cond_10
a=0;//     #v0=(PosByte);v17=(PosByte);
a=0;//     sget-boolean v17, Lcom/google/gson/internal/LinkedTreeMap;->$assertionsDisabled:Z
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_11
a=0;// 
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v1, v0, :cond_11
a=0;// 
a=0;//     const/16 v17, 0x1
a=0;// 
a=0;//     #v17=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq v1, v0, :cond_11
a=0;// 
a=0;//     new-instance v17, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct/range {v17 .. v17}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 362
a=0;//     :cond_11
a=0;//     #v0=(Byte);v17=(Byte);
a=0;//     invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v9, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 363
a=0;//     if-nez p2, :cond_a
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// .end method
a=0;// 
a=0;// .method private replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .local p2, "replacement":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 286
a=0;//     .local v0, "parent":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 287
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     iput-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 295
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     sget-boolean v1, Lcom/google/gson/internal/LinkedTreeMap;->$assertionsDisabled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eq v1, p1, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 296
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     :cond_3
a=0;//     #v1=(Null);
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/LinkedTreeMap;->root:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private rotateLeft(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "root":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 375
a=0;//     .local v0, "left":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 376
a=0;//     .local v1, "pivot":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v2, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 377
a=0;//     .local v2, "pivotLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v2=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v3, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 380
a=0;//     .local v3, "pivotRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v3=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 381
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 382
a=0;//     iput-object p1, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 385
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 388
a=0;//     iput-object p1, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 389
a=0;//     iput-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 392
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v4, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Integer);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget v4, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 394
a=0;//     iget v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget v5, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 396
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     move v6, v5
a=0;// 
a=0;//     .line 392
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v6=(Integer);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private rotateRight(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "root":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 402
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 403
a=0;//     .local v0, "pivot":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 404
a=0;//     .local v3, "right":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v3=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 405
a=0;//     .local v1, "pivotLeft":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 408
a=0;//     .local v2, "pivotRight":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v2=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 409
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     iput-object p1, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 416
a=0;//     iput-object p1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 417
a=0;//     iput-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 420
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget v4, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Integer);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget v4, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 422
a=0;//     iget v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v5, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 424
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     move v6, v5
a=0;// 
a=0;//     .line 420
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v6=(Integer);
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private writeReplace()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/ObjectStreamException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap;->root:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     .line 103
a=0;//     iget v1, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "header":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iput-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public containsKey(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByObject(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public entrySet()Ljava/util/Set;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->entrySet:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;
a=0;// 
a=0;//     .line 431
a=0;//     .local v0, "result":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$EntrySet;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .end local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;
a=0;// 
a=0;//     .end local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$EntrySet;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;-><init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$EntrySet;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->entrySet:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method find(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 10
a=0;//     .param p2, "create"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;Z)",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 122
a=0;//     #v8=(Null);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap;->comparator:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 123
a=0;//     .local v2, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<-TK;>;"
a=0;//     #v2=(Reference,Ljava/util/Comparator;);
a=0;//     iget-object v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->root:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 124
a=0;//     .local v6, "nearest":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v6=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     .local v3, "comparison":I
a=0;//     #v3=(Null);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 129
a=0;//     sget-object v7, Lcom/google/gson/internal/LinkedTreeMap;->NATURAL_ORDER:Ljava/util/Comparator;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Comparator;);
a=0;//     if-ne v2, v7, :cond_1
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     check-cast v7, Ljava/lang/Comparable;
a=0;// 
a=0;//     move-object v1, v7
a=0;// 
a=0;//     .line 134
a=0;//     .local v1, "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Comparable;);v3=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v7, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v1, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 139
a=0;//     :goto_1
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     move-object v8, v6
a=0;// 
a=0;//     .line 180
a=0;//     .end local v1    # "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     return-object v8
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v7=(Reference,Ljava/util/Comparator;);v8=(Null);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     .line 129
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     .restart local v1    # "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Comparable;);v3=(Integer);
a=0;//     iget-object v7, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v2, p1, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_3
a=0;//     if-gez v3, :cond_5
a=0;// 
a=0;//     iget-object v0, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_3
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 154
a=0;//     .end local v0    # "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v1    # "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 161
a=0;//     .local v5, "header":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v5=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 163
a=0;//     sget-object v7, Lcom/google/gson/internal/LinkedTreeMap;->NATURAL_ORDER:Ljava/util/Comparator;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Comparator;);
a=0;//     if-ne v2, v7, :cond_7
a=0;// 
a=0;//     instance-of v7, p1, Ljava/lang/Comparable;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v7, Ljava/lang/ClassCastException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/ClassCastException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " is not Comparable"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/ClassCastException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 144
a=0;//     .end local v5    # "header":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .restart local v1    # "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     :cond_5
a=0;//     #v1=(Reference,Ljava/lang/Comparable;);v5=(Uninit);v8=(Null);v9=(Uninit);
a=0;//     iget-object v0, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 149
a=0;//     .restart local v0    # "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_6
a=0;//     move-object v6, v0
a=0;// 
a=0;//     .line 150
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     .end local v0    # "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v1    # "comparableKey":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Object;>;"
a=0;//     .restart local v5    # "header":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v7=(Conflicted);
a=0;//     new-instance v4, Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v7, v5, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     invoke-direct {v4, v6, p1, v5, v7}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>(Lcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 167
a=0;//     .local v4, "created":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v4=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v4, p0, Lcom/google/gson/internal/LinkedTreeMap;->root:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 177
a=0;//     :goto_4
a=0;//     #v7=(Conflicted);
a=0;//     iget v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     .line 178
a=0;//     iget v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     iput v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     move-object v8, v4
a=0;// 
a=0;//     .line 180
a=0;//     #v8=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 169
a=0;//     .end local v4    # "created":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_8
a=0;//     #v4=(Uninit);v7=(Conflicted);v8=(Null);
a=0;//     new-instance v4, Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v7, v5, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     invoke-direct {v4, v6, p1, v5, v7}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>(Lcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 170
a=0;//     .restart local v4    # "created":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v4=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-gez v3, :cond_9
a=0;// 
a=0;//     .line 171
a=0;//     iput-object v4, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 175
a=0;//     :goto_5
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {p0, v6, v7}, Lcom/google/gson/internal/LinkedTreeMap;->rebalance(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 173
a=0;//     :cond_9
a=0;//     #v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v4, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method findByEntry(Ljava/util/Map$Entry;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<**>;)",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
a=0;//     invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v2}, Lcom/google/gson/internal/LinkedTreeMap;->findByObject(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "mine":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/google/gson/internal/LinkedTreeMap;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 204
a=0;//     .local v1, "valuesEqual":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .end local v0    # "mine":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     .line 203
a=0;//     .end local v1    # "valuesEqual":Z
a=0;//     .restart local v0    # "mine":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     .restart local v1    # "valuesEqual":Z
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method findByObject(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, p1, v2}, Lcom/google/gson/internal/LinkedTreeMap;->find(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 187
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "e":Ljava/lang/ClassCastException;
a=0;//     #v0=(Reference,Ljava/lang/ClassCastException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByObject(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public keySet()Ljava/util/Set;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Set",
a=0;//             "<TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->keySet:Lcom/google/gson/internal/LinkedTreeMap$KeySet;
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "result":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$KeySet;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .end local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;
a=0;// 
a=0;//     .end local v0    # "result":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$KeySet;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$KeySet;-><init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$KeySet;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->keySet:Lcom/google/gson/internal/LinkedTreeMap$KeySet;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v2, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v3, "key == null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, p1, v2}, Lcom/google/gson/internal/LinkedTreeMap;->find(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "created":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 96
a=0;//     .local v1, "result":Ljava/lang/Object;, "TV;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 97
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternalByKey(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 112
a=0;//     .local v0, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method removeInternal(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;//     .locals 10
a=0;//     .param p2, "unlink"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;Z)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     .local p1, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 218
a=0;//     #v8=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v6, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v7, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v7, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v6, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iget-object v7, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iput-object v7, v6, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 224
a=0;//     .local v1, "left":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 225
a=0;//     .local v4, "right":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v4=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 226
a=0;//     .local v3, "originalParent":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v3=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 237
a=0;//     iget v6, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v4, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v6, v7, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/google/gson/internal/LinkedTreeMap$Node;->last()Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 238
a=0;//     .local v0, "adjacent":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     invoke-virtual {p0, v0, v9}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternal(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     .local v2, "leftHeight":I
a=0;//     #v2=(Null);
a=0;//     iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 242
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 243
a=0;//     iget v2, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 244
a=0;//     #v2=(Integer);
a=0;//     iput-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 245
a=0;//     iput-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 246
a=0;//     iput-object v8, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 250
a=0;//     .local v5, "rightHeight":I
a=0;//     #v5=(Null);
a=0;//     iget-object v4, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 251
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     iget v5, v4, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 253
a=0;//     #v5=(Integer);
a=0;//     iput-object v4, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 254
a=0;//     iput-object v0, v4, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 255
a=0;//     iput-object v8, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 258
a=0;//     :cond_2
a=0;//     invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 259
a=0;//     invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 274
a=0;//     .end local v0    # "adjacent":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .end local v2    # "leftHeight":I
a=0;//     .end local v5    # "rightHeight":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 237
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v5=(Uninit);v7=(Integer);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/internal/LinkedTreeMap$Node;->first()Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 262
a=0;//     invoke-direct {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 263
a=0;//     iput-object v8, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 271
a=0;//     :goto_2
a=0;//     invoke-direct {p0, v3, v9}, Lcom/google/gson/internal/LinkedTreeMap;->rebalance(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     .line 272
a=0;//     iget v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     .line 273
a=0;//     iget v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 264
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 265
a=0;//     invoke-direct {p0, p1, v4}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     .line 266
a=0;//     iput-object v8, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 268
a=0;//     :cond_6
a=0;//     invoke-direct {p0, p1, v8}, Lcom/google/gson/internal/LinkedTreeMap;->replaceInParent(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method removeInternalByKey(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByObject(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 278
a=0;//     .local v0, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternal(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>;"
a=0;//     iget v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
