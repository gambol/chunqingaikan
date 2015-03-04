package com.twocloo.com.cn.adapters; class SearchResultAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SearchResultAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
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
a=0;// .field private final context:Landroid/content/Context;
a=0;// 
a=0;// .field private mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mQueue:Lcom/android/volley/RequestQueue;
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
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     .local p2, "newBooks":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/SearchResultAdapter;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->getInstance()Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->newBooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->netType:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 55
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {p1}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mQueue:Lcom/android/volley/RequestQueue;
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
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->newBooks:Ljava/util/ArrayList;
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
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->newBooks:Ljava/util/ArrayList;
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
a=0;//     .line 70
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 12
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 74
a=0;//     #v3=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 75
a=0;//     .local v9, "key":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v7, "curView":Landroid/view/View;
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v8, "holder":Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;//     #v8=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v0, v9, v2}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .end local v7    # "curView":Landroid/view/View;
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/view/View;
a=0;// 
a=0;//     .line 82
a=0;//     .restart local v7    # "curView":Landroid/view/View;
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->menu_newbook_item:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;// 
a=0;//     .end local v8    # "holder":Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;);
a=0;//     invoke-direct {v8, v2}, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;-><init>(Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;)V
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v8    # "holder":Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->imgContainer:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->imgContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 86
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->theme_list_img:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 87
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->theme_list_title:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 88
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->theme_list_clicknum:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->clickNum:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 89
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->theme_list_type:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->type:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 90
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tv_description:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v0, v9, v7}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->newBooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     .line 100
a=0;//     .local v6, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 101
a=0;//     .local v11, "mTitle":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v11, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 105
a=0;//     :goto_1
a=0;//     iget-object v1, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->clickNum:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v0, v2, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit16 v2, v2, 0x2710
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u4e07"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->type:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getSortname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->netType:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->isNoNeedPic(Lcom/twocloo/base/common/NetType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->imgContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 124
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v10=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 95
a=0;//     .end local v6    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     .end local v11    # "mTitle":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Null);v4=(PosByte);v5=(Uninit);v6=(Uninit);v8=(Null);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .end local v8    # "holder":Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;// 
a=0;//     .restart local v8    # "holder":Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     .restart local v6    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     .restart local v11    # "mTitle":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);v11=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(PosShort);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 114
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_4
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/android/volley/toolbox/ImageLoader;->getImageListener(Landroid/widget/ImageView;IIZ)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 116
a=0;//     .local v10, "listener":Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     #v10=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageListener;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/SearchResultAdapter;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v10}, Lcom/android/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 118
a=0;//     .end local v10    # "listener":Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Conflicted);v10=(Uninit);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;ZLandroid/widget/ImageView$ScaleType;Z)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 123
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Conflicted);v4=(PosByte);v5=(Uninit);
a=0;//     iget-object v0, v8, Lcom/twocloo/com/cn/adapters/SearchResultAdapter$ViewHolder;->icon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
