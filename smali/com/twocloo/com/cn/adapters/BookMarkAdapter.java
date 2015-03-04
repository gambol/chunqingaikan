package com.twocloo.com.cn.adapters; class BookMarkAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "BookMarkAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field df:Ljava/text/DecimalFormat;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private inetntTag:Ljava/lang/String;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMark;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p3, "inetntTag"    # Ljava/lang/String;
a=0;//     .param p4, "handler"    # Landroid/os/Handler;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMark;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/os/Handler;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "##.##"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->df:Ljava/text/DecimalFormat;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     new-instance p2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local p2    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     #p2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     .restart local p2    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     :cond_0
a=0;//     #p2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->inetntTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->inetntTag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .line 55
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 15
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     .local v7, "item":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     #v7=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;// 
a=0;//     .end local v7    # "item":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-direct {v7, v11}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;-><init>(Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;)V
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v7    # "item":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v11}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 64
a=0;//     .local v6, "inflate":Landroid/view/LayoutInflater;
a=0;//     #v6=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v11, Lcom/twocloo/com/cn/R$layout;->bookmark_item:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v6, v11, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 65
a=0;//     .local v10, "v":Landroid/view/View;
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->mark_item_rl:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 66
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->mark_item_title:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 67
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->mark_item_jj:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->jj:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 68
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->mark_item_time:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->time:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 69
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->mark_item_p:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->p:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 70
a=0;//     sget v11, Lcom/twocloo/com/cn/R$id;->bt_delete:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->bt_delete:Landroid/widget/Button;
a=0;// 
a=0;//     .line 71
a=0;//     move-object/from16 p2, v10
a=0;// 
a=0;//     .line 72
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     .end local v6    # "inflate":Landroid/view/LayoutInflater;
a=0;//     .end local v10    # "v":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     .line 78
a=0;//     .local v2, "bm":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getTextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 79
a=0;//     .local v9, "textid":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getLocation()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 80
a=0;//     .local v1, "beg":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getTexttitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->jj:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getTextjj()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v11, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v12, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v11=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v12, Ljava/util/Date;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getTime()J
a=0;// 
a=0;//     move-result-wide v13
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     invoke-direct {v12, v13, v14}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v11, v12}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 84
a=0;//     .local v3, "data":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->time:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v12, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;);
a=0;//     invoke-direct {v12, p0, v2, v9, v1}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;-><init>(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/beans/BookMark;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$1;);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 102
a=0;//     .local v5, "hold":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;);
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->bt_delete:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v12, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;);
a=0;//     invoke-direct {v12, p0, v2}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;-><init>(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/beans/BookMark;)V
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getLocation()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-double v11, v11
a=0;// 
a=0;//     #v11=(DoubleLo);v12=(DoubleHi);
a=0;//     const-wide/high16 v13, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v13=(LongLo);
a=0;//     mul-double/2addr v11, v13
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMark;->getLength()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-double v13, v13
a=0;// 
a=0;//     #v13=(DoubleLo);v14=(DoubleHi);
a=0;//     div-double/2addr v11, v13
a=0;// 
a=0;//     double-to-float v4, v11
a=0;// 
a=0;//     .line 113
a=0;//     .local v4, "fPercent":F
a=0;//     #v4=(Float);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->df:Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v12=(Reference,Ljava/text/DecimalFormat;);
a=0;//     const/high16 v13, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     mul-float/2addr v13, v4
a=0;// 
a=0;//     #v13=(Float);
a=0;//     float-to-double v13, v13
a=0;// 
a=0;//     #v13=(DoubleLo);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "%"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 114
a=0;//     .local v8, "strPercent":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;->p:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "["
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "]"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-object p2
a=0;// 
a=0;//     .line 74
a=0;//     .end local v1    # "beg":I
a=0;//     .end local v2    # "bm":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     .end local v3    # "data":Ljava/lang/String;
a=0;//     .end local v4    # "fPercent":F
a=0;//     .end local v5    # "hold":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     .end local v8    # "strPercent":Ljava/lang/String;
a=0;//     .end local v9    # "textid":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .end local v7    # "item":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;// 
a=0;//     .restart local v7    # "item":Lcom/twocloo/com/cn/adapters/BookMarkAdapter$MarkListItem;
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
