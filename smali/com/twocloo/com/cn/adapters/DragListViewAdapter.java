package com.twocloo.com.cn.adapters; class DragListViewAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/DragListViewAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "DragListViewAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/User;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/DragListViewAdapter;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 25
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
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .param p1, "position"    # I
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
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "viewHolder":Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     #v0=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;// 
a=0;//     .end local v0    # "viewHolder":Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;);
a=0;//     invoke-direct {v0, p0, v3}, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;-><init>(Lcom/twocloo/com/cn/adapters/DragListViewAdapter;Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;)V
a=0;// 
a=0;//     .line 51
a=0;//     .restart local v0    # "viewHolder":Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->drag_listview_item:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 52
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->biaotian1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 53
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->biaotian2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     .line 54
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->biaotian3:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     .line 55
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->user_qianming:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->qianmingTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 56
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->user_logo:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->UserimageView:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 57
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->user_name:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;->usernameTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 58
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 62
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "viewHolder":Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;// 
a=0;//     .restart local v0    # "viewHolder":Lcom/twocloo/com/cn/adapters/DragListViewAdapter$ViewHolder;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setData(Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/User;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     .local p1, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/User;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
}}
