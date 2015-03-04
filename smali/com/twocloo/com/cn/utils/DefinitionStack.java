package com.twocloo.com.cn.utils; class DefinitionStack { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/DefinitionStack;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DefinitionStack.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private list:Ljava/util/LinkedList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/LinkedList",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/utils/DefinitionStack;, "Lcom/twocloo/com/cn/utils/DefinitionStack<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 10
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/DefinitionStack;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public pop()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/utils/DefinitionStack;, "Lcom/twocloo/com/cn/utils/DefinitionStack<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 16
a=0;//     .local v0, "obj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v1}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 17
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 18
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 20
a=0;//     .end local v0    # "obj":Ljava/lang/Object;, "TT;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public popAll()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/utils/DefinitionStack;, "Lcom/twocloo/com/cn/utils/DefinitionStack<TT;>;"
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public push(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/utils/DefinitionStack;, "Lcom/twocloo/com/cn/utils/DefinitionStack<TT;>;"
a=0;//     .local p1, "obj":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/utils/DefinitionStack;, "Lcom/twocloo/com/cn/utils/DefinitionStack<TT;>;"
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/DefinitionStack;->list:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
