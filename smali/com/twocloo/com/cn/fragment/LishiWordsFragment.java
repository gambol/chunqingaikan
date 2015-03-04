package com.twocloo.com.cn.fragment; class LishiWordsFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "LishiWordsFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ValidFragment"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private footerview:Landroid/view/View;
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
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ValidFragment"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p1, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteSearchHistroy()V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 5
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     #v4=(Null);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->hot_keyword_fragment:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->hot_keyword:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->load_more_footer:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->loadinglayout:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->loadingtv:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v2, "\u6e05\u9664\u5386\u53f2\u8bb0\u5f55"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;-><init>(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->adapter:Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->adapter:Lcom/twocloo/com/cn/fragment/LishiWordsFragment$hotkeyWordsAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 74
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
