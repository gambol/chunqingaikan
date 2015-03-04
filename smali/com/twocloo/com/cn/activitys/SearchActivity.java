package com.twocloo.com.cn.activitys; class SearchActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// .super Landroid/support/v4/app/FragmentActivity;
a=0;// .source "SearchActivity.java"
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
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/SearchResultAdapter;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
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
a=0;// .field private inflater:Landroid/view/LayoutInflater;
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
a=0;// .field private searchBtn:Landroid/widget/Button;
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
a=0;// .field private transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/SearchActivity;->isBackFromNovel:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SearchActivity;);
a=0;//     const-string v0, "SearchActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 74
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 78
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchResultList:Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     .line 80
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->currentpage:I
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SearchActivity;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private doSearch()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
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
a=0;//     .line 218
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p0, v3, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 238
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 221
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->loading_text:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 223
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->currentpage:I
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
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
a=0;//     .line 225
a=0;//     .local v2, "searchContent":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 231
a=0;//     .local v1, "sdf":Ljava/text/SimpleDateFormat;
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     .local v0, "histroybean":Lcom/twocloo/com/cn/beans/SearchHistroyBean;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/SearchHistroyBean;);
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setContent(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
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
a=0;//     .line 234
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/SearchHistroyBean;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->addSearchResult(Lcom/twocloo/com/cn/beans/SearchHistroyBean;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     :cond_2
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
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->querySearchHistroy()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V
a=0;// 
a=0;//     .line 195
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
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
a=0;//     .line 195
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initData()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
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
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const-string v1, "\u53d6\u6d88"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 183
a=0;//     :goto_0
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getData()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const-string v1, "\u641c\u7d22"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_et:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 134
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->ll_search:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 135
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->titlebarlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/SearchActivity;->layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 136
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_im:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 137
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 138
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->menu_search_ly_num:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->menu_search_ly_num:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 139
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->menu_search_ly_lv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->menu_search_ly_lv:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->search_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setEditTextEmpty()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
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
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setInputMethodState()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const-string v1, "input_method"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 266
a=0;//     .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 267
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->search_im:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->finish()V
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 208
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 91
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->search_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SearchActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 93
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/SearchActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->initView()V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->manager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->manager:Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->menu_search_ly_lv:I
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/SearchHotKeyFragment;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->transaction:Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_tv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setTextColor(I)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->searchBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->search_edit:Landroid/widget/EditText;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/SearchActivity$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/SearchActivity$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/activitys/SearchActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SearchActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/SearchActivity$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getData()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 126
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->data:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->histroyList:Ljava/util/List;
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
a=0;//     .line 125
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V
a=0;// 
a=0;//     .line 168
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 162
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SearchActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->ll_search:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->menu_search_ly_lv:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SearchActivity;->menu_search_ly_num:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 154
a=0;//     sget-object v0, Lcom/twocloo/com/cn/activitys/SearchActivity;->layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
}}
