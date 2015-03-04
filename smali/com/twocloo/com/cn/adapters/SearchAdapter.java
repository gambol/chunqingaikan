package com.twocloo.com.cn.adapters; class SearchAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SearchAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     .local p2, "mlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/SearchAdapter;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "arg2"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     .local v0, "holder":Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->search_item:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 52
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->tv_context:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;->access$0(Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 58
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;->access$1(Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/SearchAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 60
a=0;//     return-object p2
a=0;// 
a=0;//     .line 55
a=0;//     .end local v0    # "holder":Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;// 
a=0;//     .restart local v0    # "holder":Lcom/twocloo/com/cn/adapters/SearchAdapter$ViewHolder;
a=0;//     goto :goto_0
a=0;// .end method
}}
