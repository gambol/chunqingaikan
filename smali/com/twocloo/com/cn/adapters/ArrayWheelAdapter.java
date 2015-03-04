package com.twocloo.com.cn.adapters; class ArrayWheelAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ArrayWheelAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/twocloo/com/cn/adapters/WheelAdapter;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT_LENGTH:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private items:[Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private length:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>([Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "items"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;, "Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter<TT;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;-><init>([Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([Ljava/lang/Object;I)V
a=0;//     .locals 0
a=0;//     .param p1, "items"    # [Ljava/lang/Object;
a=0;//     .param p2, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TT;I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;, "Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->items:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 39
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->length:I
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getItem(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;, "Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter<TT;>;"
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->items:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->items:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemsCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;, "Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter<TT;>;"
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->items:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaximumLength()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     .local p0, "this":Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;, "Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter<TT;>;"
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/adapters/ArrayWheelAdapter;->length:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
