package com.twocloo.com.cn.adapters; class AdapterForLikeMoreBook { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "AdapterForLikeMoreBook.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private bookcover:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;// .field private datas:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private lruCache:Landroid/support/v4/util/LruCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/LruCache",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     .local p2, "datas":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/LikeMoreBookBean;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 48
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->datas:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-static {p1}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->datas:Ljava/util/ArrayList;
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
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->datas:Ljava/util/ArrayList;
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
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 9
a=0;//     .param p1, "arg0"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "arg2"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .local v3, "tag":Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;// 
a=0;//     .end local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;-><init>()V
a=0;// 
a=0;//     .line 72
a=0;//     .restart local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$layout;->more_book_item:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->bookname:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookname:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 78
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->viewCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->totalviews:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 79
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->booklayout:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->itemlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 80
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->book_cover:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookcaver:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookcaver:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->bookcover:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->datas:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;//     .line 83
a=0;//     .local v2, "book":Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "bname":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "author":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookname:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->totalviews:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "\u4eba\u6b63\u5728\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;->getLruCache(Landroid/content/Context;)Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->mQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getImagefnameUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->bookcover:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     invoke-static {v4, v5, v6, v7, v8}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;->downLoadImage(Lcom/android/volley/RequestQueue;Landroid/content/Context;Ljava/lang/String;Lcom/android/volley/toolbox/NetworkImageView;Landroid/support/v4/util/LruCache;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookname:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->pinglun_night_text:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 113
a=0;//     :goto_1
a=0;//     return-object p2
a=0;// 
a=0;//     .line 75
a=0;//     .end local v0    # "author":Ljava/lang/String;
a=0;//     .end local v1    # "bname":Ljava/lang/String;
a=0;//     .end local v2    # "book":Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;// 
a=0;//     .restart local v3    # "tag":Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     .restart local v0    # "author":Ljava/lang/String;
a=0;//     .restart local v1    # "bname":Ljava/lang/String;
a=0;//     .restart local v2    # "book":Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Lcom/twocloo/com/cn/beans/LikeMoreBookBean;);v4=(Integer);v5=(One);v6=(Reference,Ljava/lang/String;);v7=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);v8=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     iget-object v4, v3, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook$LikeMoreBookHolder;->bookname:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->gray_dark_text:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
