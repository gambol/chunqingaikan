package com.twocloo.com.cn.adapters; class FriendGridviewAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "FriendGridviewAdapter.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private isChenked:Z
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
a=0;//     .param p1, "context"    # Landroid/content/Context;
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
a=0;//     .line 28
a=0;//     .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->isChenked:Z
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->isChenked:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->isChenked:Z
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
a=0;//     .line 35
a=0;//     const/4 v0, 0x6
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
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .line 45
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 7
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     .local v3, "view":Landroid/view/View;
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$layout;->add_friend_grid_item:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v3=(Reference,Landroid/view/View;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->user_logo:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "imageView":Landroid/widget/ImageView;
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->user_name:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "textView":Landroid/widget/TextView;
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->is_guanzhu:I
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "button":Landroid/widget/Button;
a=0;//     new-instance v4, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter$1;);
a=0;//     invoke-direct {v4, p0, v0}, Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter$1;-><init>(Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter;Landroid/widget/Button;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/FriendGridviewAdapter$1;);
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 78
a=0;//     return-object v3
a=0;// 
a=0;//     .line 55
a=0;//     .end local v0    # "button":Landroid/widget/Button;
a=0;//     .end local v1    # "imageView":Landroid/widget/ImageView;
a=0;//     .end local v2    # "textView":Landroid/widget/TextView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
}}
