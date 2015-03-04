package com.twocloo.com.cn.fragment; class SearchResultFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SearchResultFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;// .field private currentpage:I
a=0;// 
a=0;// .field private footerview:Landroid/view/View;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private histroyList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SearchHistroyBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;// .field private searchTotalCount:I
a=0;// 
a=0;// .field private search_keyword:Ljava/lang/String;
a=0;// 
a=0;// .field private st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment;);
a=0;//     const-string v0, "SearchActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     .line 58
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/SearchResultFragment$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchResultFragment$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Lcom/twocloo/com/cn/threads/SearchThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/fragment/SearchResultFragment;Lcom/twocloo/com/cn/beans/SearchResult;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/fragment/SearchResultFragment;Lcom/twocloo/com/cn/adapters/SearchResultAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/SearchResultAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->load_more_footer:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadinglayout:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadingtv:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->footerview:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcom/twocloo/com/cn/threads/SearchThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SearchThread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 6
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->search_result_fragment:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 131
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->search_listView:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->loading_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getArguments()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "key_word"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     .line 134
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->initView()V
a=0;// 
a=0;//     .line 135
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->currentpage:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v1, v2, v3, v4, v5}, Lcom/twocloo/com/cn/threads/SearchThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/threads/SearchThread;->start()V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;-><init>(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 158
a=0;//     return-object v0
a=0;// .end method
}}
