package com.twocloo.com.cn.adapters; class AdapterForLinearLayout { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "AdapterForLinearLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private context:Landroid/app/Activity;
a=0;// 
a=0;// .field private datas:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Shuping_maininfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private supportCount:I
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/app/Activity;
a=0;//     .param p2, "articleid"    # Ljava/lang/String;
a=0;//     .param p3, "userid"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;//     .param p6, "handler"    # Landroid/os/Handler;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Shuping_maininfo;",
a=0;//             ">;",
a=0;//             "Landroid/os/Handler;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p5, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Shuping_maininfo;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     .line 61
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     .line 62
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->datas:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->datas:Ljava/util/ArrayList;
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
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->datas:Ljava/util/ArrayList;
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
a=0;//     .line 79
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 9
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SimpleDateFormat"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v7=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     .local v3, "tag":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$layout;->novel_sbxxy_pinglun:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;// 
a=0;//     .end local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;);
a=0;//     invoke-direct {v3, v7}, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;-><init>(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;)V
a=0;// 
a=0;//     .line 88
a=0;//     .restart local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;);
a=0;//     invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 89
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->icon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 90
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->huifu_icon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->replyicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 91
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->support_icon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->supporticon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 92
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->more_icon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->moreicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 93
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 94
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->pingluntime:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->pingluntime:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 95
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->content:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 96
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->huifucountTv:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->huifucount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 97
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->supportTv:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->supportcount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 98
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->shuping_ly:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->pinglunItem:Landroid/view/View;
a=0;// 
a=0;//     .line 99
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->supportlayout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 100
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->bottomlayout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->datas:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 105
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v5, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v6, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v6, Ljava/util/Date;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getDateline()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v5, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "data":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->pingluntime:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u53d1\u8868\u4e8e "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->huifucount:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getReplies()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/OtherUtils;->transferCount(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "supportTotalCount"
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 113
a=0;//     .local v2, "supportTotalCount":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->supportcount:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-boolean v6, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->supportCount:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "supportTotalCount":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     const-string v5, "/2cloo/imgCache/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v5, v6, v7, v8}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     .line 121
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 122
a=0;//     .local v4, "tag1":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;);
a=0;//     iget-object v5, v4, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->huifuLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v6, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$1;);
a=0;//     invoke-direct {v6, p0, v1, v0}, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$1;-><init>(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;Lcom/twocloo/com/cn/beans/Shuping_maininfo;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$1;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v5, v4, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->supportlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v6, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$2;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$2;);
a=0;//     invoke-direct {v6, p0, v1, v4}, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$2;-><init>(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;Lcom/twocloo/com/cn/beans/Shuping_maininfo;Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$2;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->moreicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v6, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$3;);
a=0;//     invoke-direct {v6, p0, v1}, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$3;-><init>(Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;Lcom/twocloo/com/cn/beans/Shuping_maininfo;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$3;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_3
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$color;->pinglun_night_text:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 207
a=0;//     :goto_2
a=0;//     return-object p2
a=0;// 
a=0;//     .line 102
a=0;//     .end local v0    # "data":Ljava/lang/String;
a=0;//     .end local v1    # "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     .end local v4    # "tag1":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;// 
a=0;//     .restart local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     .restart local v0    # "data":Ljava/lang/String;
a=0;//     .restart local v1    # "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);v2=(Reference,Ljava/lang/String;);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/view/CircleImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 204
a=0;//     .restart local v4    # "tag1":Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;
a=0;//     :cond_3
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;);v5=(Integer);v6=(One);
a=0;//     iget-object v5, v3, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$color;->gray_dark_text:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
