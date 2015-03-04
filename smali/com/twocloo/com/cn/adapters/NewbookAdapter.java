package com.twocloo.com.cn.adapters; class NewbookAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/NewbookAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "NewbookAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/base/cache/Cache",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final context:Landroid/app/Activity;
a=0;// 
a=0;// .field private netType:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;// .field private final newBooks:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     .local p2, "newBooks":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/NewbookAdapter;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->getInstance()Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->newBooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 36
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->netType:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->newBooks:Ljava/util/ArrayList;
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
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->newBooks:Ljava/util/ArrayList;
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
a=0;//     .line 48
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
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0xc
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v7=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "key":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "curView":Landroid/view/View;
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     .local v2, "holder":Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     #v2=(Null);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v5, v3, v7}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "curView":Landroid/view/View;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     .line 60
a=0;//     .restart local v1    # "curView":Landroid/view/View;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->context:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$layout;->menu_newbook_item:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;// 
a=0;//     .end local v2    # "holder":Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;);
a=0;//     invoke-direct {v2, v7}, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;-><init>(Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;)V
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v2    # "holder":Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->imgContainer:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->imgContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 64
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->theme_list_img:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 65
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->theme_list_title:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 66
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->theme_list_clicknum:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->clickNum:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 67
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->theme_list_type:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->type:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 68
a=0;//     sget v5, Lcom/twocloo/com/cn/R$id;->tv_description:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v5, v3, v1}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->newBooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/NewbookAdapter;->netType:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->isNoNeedPic(Lcom/twocloo/base/common/NetType;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->imgContainer:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 91
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 92
a=0;//     .local v4, "mTitle":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v5, v9, :cond_3
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 97
a=0;//     :goto_2
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->clickNum:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-int/lit16 v7, v7, 0x2710
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u4e07"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->type:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getSortname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 108
a=0;//     return-object v1
a=0;// 
a=0;//     .line 78
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     .end local v4    # "mTitle":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Null);v4=(Uninit);v7=(Null);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "holder":Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;// 
a=0;//     .restart local v2    # "holder":Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .restart local v0    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);v5=(Boolean);v6=(Conflicted);
a=0;//     const-string v5, "/2cloo/imgCache/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v5, v6, v7, v8}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Null);
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v4    # "mTitle":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Reference,Ljava/lang/String;);v5=(Integer);v7=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v5, v2, Lcom/twocloo/com/cn/adapters/NewbookAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
