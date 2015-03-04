package com.twocloo.com.cn.adapters; class ReplyAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ReplyAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ReplyAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/app/Activity;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mAid:Ljava/lang/String;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;// .field private mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;// .field private replyInfo:Ljava/util/ArrayList;
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
a=0;// .field private supportCount:I
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private userid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/app/Activity;
a=0;//     .param p3, "uid"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;//     .param p5, "aid"    # Ljava/lang/String;
a=0;//     .param p6, "handler"    # Landroid/os/Handler;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Shuping_maininfo;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/os/Handler;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Shuping_maininfo;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ReplyAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->supportCount:I
a=0;// 
a=0;//     .line 62
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->replyInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mAid:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->userid:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 74
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {p1}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/utils/BitmapCache;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/utils/BitmapCache;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/utils/BitmapCache;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/utils/BitmapCache;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/android/volley/toolbox/ImageLoader;-><init>(Lcom/android/volley/RequestQueue;Lcom/android/volley/toolbox/ImageLoader$ImageCache;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/ReplyAdapter;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/adapters/ReplyAdapter;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/adapters/ReplyAdapter;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->userid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/adapters/ReplyAdapter;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mAid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/adapters/ReplyAdapter;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/adapters/ReplyAdapter;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->replyInfo:Ljava/util/ArrayList;
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
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->replyInfo:Ljava/util/ArrayList;
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
a=0;//     .line 89
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 10
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
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v5=(Null);
a=0;//     move-object v9, p2
a=0;// 
a=0;//     .line 96
a=0;//     .local v9, "tempView":Landroid/view/View;
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;);
a=0;//     invoke-direct {v8, v2}, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;-><init>(Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;)V
a=0;// 
a=0;//     .line 98
a=0;//     .local v8, "tag":Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->reply_pinglun_item:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 99
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->more_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->moreicon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 101
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 102
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_jubao:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 103
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 104
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->lou:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->louButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v9, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->replyInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 111
a=0;//     .local v6, "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->jubaoButton:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/ReplyAdapter$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/ReplyAdapter$1;);
a=0;//     invoke-direct {v1, p0, v6}, Lcom/twocloo/com/cn/adapters/ReplyAdapter$1;-><init>(Lcom/twocloo/com/cn/adapters/ReplyAdapter;Lcom/twocloo/com/cn/beans/Shuping_maininfo;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/ReplyAdapter$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->louButton:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     add-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u697c"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 144
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2, v5}, Lcom/android/volley/toolbox/ImageLoader;->getImageListener(Landroid/widget/ImageView;IIZ)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 146
a=0;//     .local v7, "listener":Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     #v7=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageListener;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v7}, Lcom/android/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .line 153
a=0;//     .end local v7    # "listener":Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_3
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->pinglun_night_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 159
a=0;//     :goto_2
a=0;//     return-object v9
a=0;// 
a=0;//     .line 107
a=0;//     .end local v6    # "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     .end local v8    # "tag":Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;// 
a=0;//     .restart local v8    # "tag":Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     .restart local v6    # "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Reference,Ljava/lang/String;);v6=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;ZLandroid/widget/ImageView$ScaleType;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v4=(Uninit);
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->icon:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/CircleImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/CircleImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/ReplyAdapter$ShupingHolder;->contents:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ReplyAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
