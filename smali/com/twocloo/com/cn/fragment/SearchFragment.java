package com.twocloo.com.cn.fragment; class SearchFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "SearchFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static isBackFromNovel:Z
a=0;// 
a=0;// .field public static layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;// .field private currentpage:I
a=0;// 
a=0;// .field private data:Ljava/util/ArrayList;
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
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private footerview:Landroid/view/View;
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
a=0;// .field private hortory:Landroid/widget/Button;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private key:Landroid/widget/Button;
a=0;// 
a=0;// .field private ll_search:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private manager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;// .field private menu_search_ly_lv:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private menu_search_ly_num:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private searchBtn:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;// .field private searchTotalCount:I
a=0;// 
a=0;// .field private search_edit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private search_tv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private st:Lcom/twocloo/com/cn/threads/SearchThread;
a=0;// 
a=0;// .field private titlebarlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private toplayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/SearchFragment;->isBackFromNovel:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->currentpage:I
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/SearchFragment;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/SearchFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->doSearch()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doSearch()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 234
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 228
a=0;//     .local v2, "searchContent":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     .local v1, "sdf":Ljava/text/SimpleDateFormat;
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;-><init>()V
a=0;// 
a=0;//     .line 230
a=0;//     .local v0, "histroybean":Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setContent(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v3}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setTime(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->addSearchResult(Lcom/twocloo/com/cn/beans/SearchHistroyBean;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 232
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private getData()Ljava/util/ArrayList;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->querySearchHistroy()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->getContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 177
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_et:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 131
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->ll_search:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 132
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->titlebarlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/fragment/SearchFragment;->layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 133
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_im:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->searchBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->menu_search_ly_num:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->menu_search_ly_num:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->menu_search_ly_lv:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->menu_search_ly_lv:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->search_tv:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->searchBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 138
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->hot_words:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     .line 139
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->lishijulu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 142
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setEditTextEmpty()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 243
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/16 v6, -0x6667
a=0;// 
a=0;//     #v6=(Short);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->searchBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v3, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/SearchResultActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "key_word"
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->doSearch()V
a=0;// 
a=0;//     .line 217
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/util/ArrayList;);
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Byte);v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const-string v4, "\u641c\u7d22\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_2
a=0;//     #v4=(Byte);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v3, :cond_3
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->circle_ret_red:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/Button;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 202
a=0;//     .local v1, "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->mainfragment:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     .end local v1    # "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     .end local v2    # "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Reference,Landroid/widget/Button;);v4=(Byte);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 207
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getData()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->hortory:Landroid/widget/Button;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->circle_ret_red:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->key:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/Button;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 213
a=0;//     .restart local v1    # "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 214
a=0;//     .restart local v2    # "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->mainfragment:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/fragment/LishiWordsFragment;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;-><init>(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-super {p0, p3}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 98
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->search_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->initView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->manager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->manager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->mainfragment:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/SearchFragment$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchFragment$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/SearchFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/SearchFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 147
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment;->ll_search:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloo/com/cn/fragment/SearchFragment;->layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMainTopBackGrundLayout(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
}}
