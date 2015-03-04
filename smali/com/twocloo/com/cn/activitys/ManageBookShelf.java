package com.twocloo.com.cn.activitys; class ManageBookShelf { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// .super Landroid/app/Activity;
a=0;// .source "ManageBookShelf.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/TargetApi;
a=0;//     value = 0x9
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/app/Activity;",
a=0;//         "Landroid/view/View$OnClickListener;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private bookLists:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private bookname:Ljava/lang/String;
a=0;// 
a=0;// .field private bottomLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private delLists:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field public deleteCount:I
a=0;// 
a=0;// .field private deleteLists:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private donelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private gridview:Landroid/widget/GridView;
a=0;// 
a=0;// .field private imageList:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private manage_bookshelf_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private popwin:Landroid/widget/PopupWindow;
a=0;// 
a=0;// .field private tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;// .field private titleText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private updateAid:Ljava/lang/String;
a=0;// 
a=0;// .field private updateBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field updateThread:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     const-string v0, "ManageBookShelf"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteLists:Ljava/util/List;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->delLists:Ljava/util/List;
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->imageList:Ljava/util/Vector;
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;-><init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 274
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;-><init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteLists:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createConfirmDialog(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u786e\u5b9a\u8981\u5220\u9664\u9009\u4e2d\u7684\u4f5c\u54c1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;);
a=0;//     invoke-direct {v6, p0, p1}, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;-><init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 298
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/ManageBookShelf$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/ManageBookShelf$4;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf$4;-><init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)V
a=0;// 
a=0;//     .line 278
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$4;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private findviews()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Null);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 158
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->manage_bookshelf_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->manage_bookshelf_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 159
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->buttonlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bottomLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bookgridview:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/GridView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->gridview:Landroid/widget/GridView;
a=0;// 
a=0;//     .line 161
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 162
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->titleText:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 163
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->textlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->donelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 164
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->righttv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 165
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->updateallbtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 166
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->deletebtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 167
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->canclelbtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->donelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->titleText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_done:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->titleText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->gridview:Landroid/widget/GridView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->donelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private shelfEmpty(Ljava/util/Vector;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     .local p1, "bookLists":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_none_book:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 319
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 218
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 219
a=0;//     .local v2, "id":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_5
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v5, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 221
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v4, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Reference,Lcom/twocloo/base/common/NetType;);v6=(Uninit);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_selecte_book:I
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v4, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 229
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     const-string v4, "\u8fdb\u5165\u540e\u53f0\u5f00\u59cb\u66f4\u65b0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v4, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 230
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_3
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_3
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 234
a=0;//     .local v3, "s":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "bookname":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteLists:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v4, Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {v4, p0, v3, v0, v5}, Lcom/twocloo/com/cn/threads/UpdateBookThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateThread:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateThread:Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/threads/UpdateBookThread;->start()V
a=0;// 
a=0;//     .line 230
a=0;//     .end local v0    # "bookname":Ljava/lang/String;
a=0;//     .end local v3    # "s":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 244
a=0;//     .end local v1    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_7
a=0;// 
a=0;//     .line 245
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 247
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_selecte_book:I
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v4, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :cond_6
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->createConfirmDialog(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     :cond_7
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v4}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_8
a=0;// 
a=0;//     .line 252
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_8
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->doneBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v4}, Landroid/widget/TextView;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v2, v4, :cond_9
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->donelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_a
a=0;// 
a=0;//     .line 254
a=0;//     :cond_9
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_a
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_b
a=0;// 
a=0;//     .line 259
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->notifyDataSetChangedDefault()V
a=0;// 
a=0;//     .line 261
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-static {p0, v4}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_b
a=0;//     #v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 256
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 100
a=0;//     sget-object v2, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "strVer":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 103
a=0;//     invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "fv":F
a=0;//     #v0=(Float);
a=0;//     float-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x4002666666666666L    # 2.3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmpl-double v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v2, Landroid/os/StrictMode$ThreadPolicy$Builder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/StrictMode$ThreadPolicy$Builder;);
a=0;//     invoke-direct {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/StrictMode$ThreadPolicy$Builder;);
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectDiskReads()Landroid/os/StrictMode$ThreadPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectDiskWrites()Landroid/os/StrictMode$ThreadPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 105
a=0;//     invoke-static {v2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v2, Landroid/os/StrictMode$VmPolicy$Builder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/StrictMode$VmPolicy$Builder;);
a=0;//     invoke-direct {v2}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/StrictMode$VmPolicy$Builder;);
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$VmPolicy$Builder;->detectLeakedSqlLiteObjects()Landroid/os/StrictMode$VmPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$VmPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$VmPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$VmPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$VmPolicy$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {v2}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 115
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->manage_bookshelf_layout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->setContentView(I)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->findviews()V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v2, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Vector;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->gridview:Landroid/widget/GridView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/GridView;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateAid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, p0, v3, v4, v5}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;-><init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Ljava/util/Vector;Landroid/widget/GridView;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->gridview:Landroid/widget/GridView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 5
a=0;//     .param p2, "arg1"    # Landroid/view/View;
a=0;//     .param p3, "arg2"    # I
a=0;//     .param p4, "arg3"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     #v4=(Null);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->item_id:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "views":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1}, Landroid/widget/CheckBox;->toggle()V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->uncheckedbookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     .line 201
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
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
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_delete:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 196
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->uncheckedbookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 129
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->manage_bookshelf_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->bottomLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNightWithDrawable(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->updateBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTb(Lcom/twocloo/com/cn/db/LastReadTable;)V
a=0;//     .locals 0
a=0;//     .param p1, "tb"    # Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     .line 327
a=0;//     return-void
a=0;// .end method
}}
