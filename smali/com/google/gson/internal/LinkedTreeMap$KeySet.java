package com.google.gson.internal; class LinkedTreeMap$KeySet { void a() { int a;
a=0;// .class Lcom/google/gson/internal/LinkedTreeMap$KeySet;
a=0;// .super Ljava/util/AbstractSet;
a=0;// .source "LinkedTreeMap.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/LinkedTreeMap;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "KeySet"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/util/AbstractSet",
a=0;//         "<TK;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 592
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$KeySet;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/internal/LinkedTreeMap;->clear()V
a=0;// 
a=0;//     .line 615
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$KeySet$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$KeySet$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$KeySet$1;-><init>(Lcom/google/gson/internal/LinkedTreeMap$KeySet;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$KeySet$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 610
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternalByKey(Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
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
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$KeySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget v0, v0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
