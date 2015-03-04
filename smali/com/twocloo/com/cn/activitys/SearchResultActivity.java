package com.twocloo.com.cn.activitys; class SearchResultActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SearchResultActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SearchResultActivity.java"
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
a=0;// .field private backBtn:Landroid/widget/ImageView;
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
a=0;// .field private key_word:Ljava/lang/String;
a=0;// 
a=0;// .field private listView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private nonelaLayout:Landroid/widget/LinearLayout;
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
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SearchResultActivity;);
a=0;//     const-string v0, "SearchActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     .line 65
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/SearchResultActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/SearchResultActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SearchResultActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Lcom/twocloo/com/cn/threads/SearchThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->nonelaLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/SearchResultActivity;Lcom/twocloo/com/cn/beans/SearchResult;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/SearchResultActivity;Lcom/twocloo/com/cn/adapters/SearchResultAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/SearchResultAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
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
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadinglayout:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadingtv:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 177
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nulllayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->nonelaLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 198
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 199
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 203
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "title_tv":Landroid/widget/TextView;
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 208
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 183
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
a=0;//     .line 184
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 188
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/twocloo/com/cn/threads/SearchThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SearchThread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 132
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 133
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->search_result_fragment:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 134
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_listView:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->loading_text:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "key_word"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     .line 137
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->initView()V
a=0;// 
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->setTopBar()V
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->search_keyword:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->currentpage:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/twocloo/com/cn/threads/SearchThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SearchThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/SearchThread;->start()V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->listView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SearchResultActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SearchResultActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SearchResultActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/SearchResultActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SearchResultActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 213
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 219
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 225
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SearchResultActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
}}
