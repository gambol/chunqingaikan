package com.twocloo.com.cn.activitys; class NovelDetailedActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// .super Lcom/twocloo/base/openapi/QZoneAble;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/widget/RadioGroup$OnCheckedChangeListener;
a=0;// .implements Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BLURRED_IMG_PATH:Ljava/lang/String; = "blurred_image.cach"
a=0;// 
a=0;// .field private static final CROP_IMG_PATH:Ljava/lang/String; = "cropimage.cach"
a=0;// 
a=0;// .field public static isFromCityOrReadpage:Z
a=0;// 
a=0;// .field public static isJumpToReply:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ScrollView:Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;// .field private articleId:Ljava/lang/String;
a=0;// 
a=0;// .field private authorId:Ljava/lang/String;
a=0;// 
a=0;// .field private authornameTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private baoyueTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;// .field private bookImg:Ljava/lang/String;
a=0;// 
a=0;// .field private bookMarkBeans:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookMarkBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private bookcover:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private bookdetailedlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private bookname:Ljava/lang/String;
a=0;// 
a=0;// .field private booknameTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private bundle:Landroid/os/Bundle;
a=0;// 
a=0;// .field private buyBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private changeAnotherBook:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;// .field private cropImgBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private curtxid:Ljava/lang/String;
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
a=0;// .field private detaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private dorun:Z
a=0;// 
a=0;// .field private downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;// .field private enter_pinglun:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private flag:I
a=0;// 
a=0;// .field private footerview:Landroid/view/View;
a=0;// 
a=0;// .field private freeBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private goPinglun:Landroid/widget/Button;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private hasfavor:I
a=0;// 
a=0;// .field private hasrecommend:I
a=0;// 
a=0;// .field private horizontalScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private inputEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private intent:Landroid/content/Intent;
a=0;// 
a=0;// .field private isShowDialog:Z
a=0;// 
a=0;// .field private isZhankai:Z
a=0;// 
a=0;// .field private jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private like_book_layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private likebooks:Ljava/util/ArrayList;
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
a=0;// .field private likemoreAdapter:Lcom/twocloo/com/cn/adapters/AdapterForLikeMoreBook;
a=0;// 
a=0;// .field private likemoreButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private likemoreListView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;// .field private likemorehead:Landroid/widget/TextView;
a=0;// 
a=0;// .field private likemorelayout:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;// .field private line0:Landroid/view/View;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line10:Landroid/view/View;
a=0;// 
a=0;// .field private line11:Landroid/view/View;
a=0;// 
a=0;// .field private line12:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line5:Landroid/view/View;
a=0;// 
a=0;// .field private line6:Landroid/view/View;
a=0;// 
a=0;// .field private line7:Landroid/view/View;
a=0;// 
a=0;// .field private line8:Landroid/view/View;
a=0;// 
a=0;// .field private line9:Landroid/view/View;
a=0;// 
a=0;// .field private loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;// .field private loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mImgIds:[I
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private more_pinglun:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mulu:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;// .field private muluInfo:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private muluListview:Lcom/twocloo/com/cn/view/MyListView;
a=0;// 
a=0;// .field private mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private myview:Landroid/view/View;
a=0;// 
a=0;// .field private nonepinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nopinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nowClickId:I
a=0;// 
a=0;// .field private orderedChapterIdSet:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private pinglunLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private pinglunList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Shuping_maininfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private radioGroup_top:Landroid/widget/RadioGroup;
a=0;// 
a=0;// .field private readCount:Landroid/widget/TextView;
a=0;// 
a=0;// .field private readCountTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private readCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private readcounticon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private recentlyTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field s:I
a=0;// 
a=0;// .field private sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;// .field private screenHeigh:I
a=0;// 
a=0;// .field private screenWidth:I
a=0;// 
a=0;// .field private sendBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private shoucangCount:Landroid/widget/TextView;
a=0;// 
a=0;// .field private shoucangCountTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private shoucangCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private shoucangcounticon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private shuping_zong:Landroid/widget/TextView;
a=0;// 
a=0;// .field private source:Ljava/lang/String;
a=0;// 
a=0;// .field private spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;// .field private status:Landroid/widget/TextView;
a=0;// 
a=0;// .field private statusTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tb:Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;// .field private title:Ljava/lang/String;
a=0;// 
a=0;// .field private titleTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tjTask:Lcom/twocloo/com/cn/task/TuijianTask;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private tuijianCount:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tuijianCountTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tuijianCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private tuijiancounticon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private typeTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private verticleline1:Landroid/view/View;
a=0;// 
a=0;// .field private verticleline2:Landroid/view/View;
a=0;// 
a=0;// .field private viewMulu:Landroid/widget/Button;
a=0;// 
a=0;// .field private viewpinglunButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private xuxian:Landroid/view/View;
a=0;// 
a=0;// .field private zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private zishuTv:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     .line 213
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/openapi/QZoneAble;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     const-string v0, "NovelDetailedActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     .line 145
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     .line 154
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 158
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 160
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->source:Ljava/lang/String;
a=0;// 
a=0;//     .line 177
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     .line 179
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 186
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     .line 187
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isShowDialog:Z
a=0;// 
a=0;//     .line 188
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 196
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tjTask:Lcom/twocloo/com/cn/task/TuijianTask;
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 198
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dorun:Z
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 206
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 216
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isZhankai:Z
a=0;// 
a=0;//     .line 218
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->cropImgBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 1109
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/HashSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->orderedChapterIdSet:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zishuTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->recentlyTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->statusTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->baoyueTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->timeFomart(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->status:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->hasfavor:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->hasrecommend:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->hasfavor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->hasrecommend:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authorId:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->title:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readCount:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCount:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$24(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangCount:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$25(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$26(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$27(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$28(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/ImageView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookcover:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$29(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->adapter:Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForLinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$30(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$31(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$32(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nopinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$33(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$34(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likebooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$35(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likebooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$36(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->initData()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$37(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/HorizontalScrollView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likemorelayout:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/HorizontalScrollView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$38(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likemoreButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$39(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$40(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluInfo:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$41(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->curtxid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$42(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/adapters/AdapterForMulu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$43(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/view/MyListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluListview:Lcom/twocloo/com/cn/view/MyListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/MyListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$44(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluAdapter:Lcom/twocloo/com/cn/adapters/AdapterForMulu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForMulu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$45(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$46(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$47(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$48(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$49(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$50(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->ci:Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$51(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$52(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$53(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$54(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$55(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$56(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$57(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$58(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->inputEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$59(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->booknameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$60(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$61(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/threads/ShupingThread;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$62(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/HorizontalScrollView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->horizontalScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/HorizontalScrollView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$63(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$64(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authornameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->typeTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private goback()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1233
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->finish()V
a=0;// 
a=0;//     .line 1234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initData()V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     sget v13, Lcom/twocloo/com/cn/R$id;->id_gallery:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-virtual {v0, v13}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     check-cast v13, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 650
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;->getLruCache(Landroid/content/Context;)Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 651
a=0;//     .local v7, "lruCache":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
a=0;//     #v7=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 652
a=0;//     .local v8, "mQueue":Lcom/android/volley/RequestQueue;
a=0;//     #v8=(Null);
a=0;//     sget v13, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/16 v14, 0xb
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-lt v13, v14, :cond_0
a=0;// 
a=0;//     .line 653
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v13}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 655
a=0;//     :cond_0
a=0;//     #v8=(Reference,Lcom/android/volley/RequestQueue;);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$layout;->scrollledt:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v13 .. v16}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 656
a=0;//     .local v11, "view1":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v13, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 657
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likebooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lt v5, v13, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$layout;->scrollright:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     invoke-virtual/range {v13 .. v16}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 695
a=0;//     .local v12, "view2":Landroid/view/View;
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v13, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 696
a=0;//     return-void
a=0;// 
a=0;//     .line 659
a=0;//     .end local v12    # "view2":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v12=(Uninit);v13=(Integer);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$layout;->more_book_item:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     invoke-virtual/range {v13 .. v16}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 660
a=0;//     .local v10, "view":Landroid/view/View;
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     sget v13, Lcom/twocloo/com/cn/R$id;->book_cover:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v10, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     .line 661
a=0;//     .local v6, "img":Lcom/android/volley/toolbox/NetworkImageView;
a=0;//     sget v13, Lcom/twocloo/com/cn/R$id;->bookname:I
a=0;// 
a=0;//     invoke-virtual {v10, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 662
a=0;//     .local v4, "bookname":Landroid/widget/TextView;
a=0;//     sget v13, Lcom/twocloo/com/cn/R$id;->viewCount:I
a=0;// 
a=0;//     invoke-virtual {v10, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 663
a=0;//     .local v9, "totalviews":Landroid/widget/TextView;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likebooks:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;//     .line 664
a=0;//     .local v3, "book":Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 665
a=0;//     .local v2, "bname":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 666
a=0;//     .local v1, "author":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 667
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getTotalviews()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/utils/OtherUtils;->transferCount(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u4eba\u6b63\u5728\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v9, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 668
a=0;//     sget v13, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/16 v14, 0xb
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-lt v13, v14, :cond_2
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getImagefnameUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v13, v14, v6, v7}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;->downLoadImage(Lcom/android/volley/RequestQueue;Landroid/content/Context;Ljava/lang/String;Lcom/android/volley/toolbox/NetworkImageView;Landroid/support/v4/util/LruCache;)V
a=0;// 
a=0;//     .line 677
a=0;//     :goto_1
a=0;//     #v14=(Conflicted);v15=(Conflicted);
a=0;//     new-instance v13, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v13, v0, v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/beans/LikeMoreBookBean;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$7;);
a=0;//     invoke-virtual {v10, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 691
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v13, v10}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 657
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 671
a=0;//     :cond_2
a=0;//     #v13=(Integer);v14=(PosByte);v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getImagefnameUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_3
a=0;// 
a=0;//     .line 672
a=0;//     const-string v13, "/2cloo/imgCache/"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->getImagefnameUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     invoke-virtual {v13, v14, v6, v15}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 674
a=0;//     :cond_3
a=0;//     #v13=(Boolean);v14=(PosByte);v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookcover:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/ImageView;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private initViews()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 708
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->likemorelayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->horizontalScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     .line 709
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->zhankai:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 710
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 711
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     .line 712
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     .line 713
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 715
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 716
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 717
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 718
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_splv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 719
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->view_mulu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewMulu:Landroid/widget/Button;
a=0;// 
a=0;//     .line 720
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->no_pinglun_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nopinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 721
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->go_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goPinglun:Landroid/widget/Button;
a=0;// 
a=0;//     .line 722
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->moreread:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likemoreButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 723
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->likemorelayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likemorelayout:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     .line 724
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goPinglun:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 725
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nopinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 726
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->detailedlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 727
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bookdetailedlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookdetailedlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 728
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 729
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 730
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->scroll_view:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->ScrollView:Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;//     .line 731
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->top_bar_button_right_share:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 732
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 733
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->theme_list_img:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookcover:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 734
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_title:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->booknameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 735
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_author:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authornameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 736
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authornameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 737
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->RelativeLayout3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->detaiLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 738
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_type:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->typeTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 739
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_zishu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zishuTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 740
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_zhuangtai:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->statusTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 741
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->textView7:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->status:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 742
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_baoyue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->baoyueTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 743
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->new_chapter:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->recentlyTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 744
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_sbxxy_intro:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 745
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->view_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewpinglunButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 746
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 747
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 748
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line0:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line0:Landroid/view/View;
a=0;// 
a=0;//     .line 749
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line10:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line10:Landroid/view/View;
a=0;// 
a=0;//     .line 750
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->xuxian:Landroid/view/View;
a=0;// 
a=0;//     .line 751
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     .line 752
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line6:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     .line 753
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line7:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line7:Landroid/view/View;
a=0;// 
a=0;//     .line 754
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line8:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line8:Landroid/view/View;
a=0;// 
a=0;//     .line 755
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line9:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line9:Landroid/view/View;
a=0;// 
a=0;//     .line 756
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line11:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line11:Landroid/view/View;
a=0;// 
a=0;//     .line 757
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line12:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line12:Landroid/view/View;
a=0;// 
a=0;//     .line 758
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->verticleline1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->verticleline1:Landroid/view/View;
a=0;// 
a=0;//     .line 759
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->verticleline2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->verticleline2:Landroid/view/View;
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewMulu:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 761
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_book_count_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 762
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tuijian_count_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 763
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->shoucang_count_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 765
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_count_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readcounticon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 766
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tuijian_count_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijiancounticon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 767
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->shoucang_count_icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangcounticon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 768
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_count_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readCountTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 769
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tuijian_count_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCountTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 770
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->shoucang_count_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangCountTv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 771
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readCount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 772
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tuijian_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 773
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->shoucang_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangCount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 775
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->freeBtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->freeBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 776
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->sbxxy_buy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 777
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->jianjie_button_guding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 778
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mulu_button_guding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 779
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->pinglun_button_guding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 781
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_detailed_group_guding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RadioGroup;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->radioGroup_top:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     .line 782
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_detailed_group:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->myview:Landroid/view/View;
a=0;// 
a=0;//     .line 784
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->jianjie_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 785
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mulu_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 788
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->likemore_list:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->likemoreListView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->inflater:Landroid/view/LayoutInflater;
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
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     .line 792
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadinglayout:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->footerview:Landroid/view/View;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->loadingtv:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 795
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->enter_pinglun:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->enter_pinglun:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 796
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->input_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->inputEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 797
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->sendbtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sendBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 799
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->novel_mulu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/MyListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->muluListview:Lcom/twocloo/com/cn/view/MyListView;
a=0;// 
a=0;//     .line 800
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->pb:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 802
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 804
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->freeBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 806
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 807
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewpinglunButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 808
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->readCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 809
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->radioGroup_top:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 810
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 811
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setCheckedid(I)V
a=0;//     .locals 5
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1130
a=0;//     #v2=(One);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 1131
a=0;//     const/4 p1, 0x1
a=0;// 
a=0;//     .line 1132
a=0;//     #p1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 1144
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);p1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 1133
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 1134
a=0;//     const/4 p1, 0x2
a=0;// 
a=0;//     .line 1135
a=0;//     #p1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1136
a=0;//     :cond_2
a=0;//     #v0=(Integer);p1=(Integer);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_3
a=0;// 
a=0;//     if-eq p1, v3, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     if-ne p1, v3, :cond_0
a=0;// 
a=0;//     .line 1137
a=0;//     :cond_4
a=0;//     const/4 p1, 0x3
a=0;// 
a=0;//     .line 1138
a=0;//     #p1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 1140
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1141
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1142
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->enter_pinglun:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 814
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 815
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 816
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 817
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->share_btn:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 818
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->novel_sbxxy_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 819
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->titleTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 820
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showKeyBoard(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 700
a=0;//     #v2=(Null);
a=0;//     const-string v1, "input_method"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 701
a=0;//     .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
a=0;// 
a=0;//     .line 702
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 703
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private timeFomart(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p1, "stamptime"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x1
a=0;// 
a=0;//     .line 549
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 550
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 565
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 552
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(Uninit);
a=0;//     invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 553
a=0;//     .local v6, "time":J
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/32 v8, 0x5265c00
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     div-long v0, v6, v8
a=0;// 
a=0;//     .line 554
a=0;//     .local v0, "days":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v8, v0, v10
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gez v8, :cond_2
a=0;// 
a=0;//     .line 555
a=0;//     const-wide/32 v8, 0x36ee80
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     div-long v2, v6, v8
a=0;// 
a=0;//     .line 556
a=0;//     .local v2, "hours":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v8, v2, v10
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gez v8, :cond_1
a=0;// 
a=0;//     .line 557
a=0;//     const-wide/32 v8, 0xea60
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     div-long v4, v6, v8
a=0;// 
a=0;//     .line 558
a=0;//     .local v4, "minute":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\u5206\u949f\u524d\u66f4\u65b0"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 560
a=0;//     .end local v4    # "minute":J
a=0;//     :cond_1
a=0;//     #v4=(Uninit);v5=(Uninit);v8=(Byte);v9=(LongHi);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\u5c0f\u65f6\u524d\u66f4\u65b0"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 563
a=0;//     .end local v2    # "hours":J
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Uninit);v8=(Byte);v9=(LongHi);
a=0;//     const-wide/16 v8, 0x3
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     cmp-long v8, v0, v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-lez v8, :cond_3
a=0;// 
a=0;//     .line 564
a=0;//     const-string v8, "3\u5929\u524d\u66f4\u65b0"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 565
a=0;//     :cond_3
a=0;//     #v8=(Byte);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\u5929\u524d\u66f4\u65b0"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public goGeneralActivity(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1099
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1100
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1101
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1102
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, "NovelDetailedActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1103
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public initPinglun()V
a=0;//     .locals 26
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v9, v0, :cond_0
a=0;// 
a=0;//     .line 540
a=0;//     return-void
a=0;// 
a=0;//     .line 431
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v23, Lcom/twocloo/com/cn/R$layout;->novel_sbxxy_pinglun:I
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mGallery:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     invoke-virtual/range {v22 .. v25}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 432
a=0;//     .local v5, "convertView":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->icon:I
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 433
a=0;//     .local v10, "icon":Lcom/twocloo/com/cn/view/CircleImageView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->huifu_icon:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Landroid/view/View;);
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 434
a=0;//     .local v15, "replyicon":Landroid/widget/ImageView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->support_icon:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     check-cast v19, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 435
a=0;//     .local v19, "supporticon":Landroid/widget/ImageView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->more_icon:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     check-cast v12, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 436
a=0;//     .local v12, "moreicon":Landroid/widget/ImageView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Landroid/view/View;);
a=0;//     check-cast v21, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 437
a=0;//     .local v21, "username":Landroid/widget/TextView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->pingluntime:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/View;);
a=0;//     check-cast v14, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 438
a=0;//     .local v14, "pingluntime":Landroid/widget/TextView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->content:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 439
a=0;//     .local v4, "contents":Landroid/widget/TextView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->huifucountTv:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 440
a=0;//     .local v8, "huifucount":Landroid/widget/TextView;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->supportlayout:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Landroid/view/View;);
a=0;//     check-cast v20, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 441
a=0;//     .local v20, "supportlayout":Landroid/widget/RelativeLayout;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->bottomlayout:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 442
a=0;//     .local v7, "huifuLayout":Landroid/widget/RelativeLayout;
a=0;//     sget v22, Lcom/twocloo/com/cn/R$id;->supportTv:I
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Landroid/view/View;);
a=0;//     check-cast v18, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 443
a=0;//     .local v18, "supportcount":Landroid/widget/TextView;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunList:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     .line 444
a=0;//     .local v11, "info":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v22}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 445
a=0;//     new-instance v22, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v23, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v23, Ljava/util/Date;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getDateline()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-static/range {v24 .. v24}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v24
a=0;// 
a=0;//     #v24=(LongLo);v25=(LongHi);
a=0;//     invoke-direct/range {v23 .. v25}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 446
a=0;//     .local v6, "data":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "\u53d1\u8868\u4e8e "
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getReplies()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     invoke-static/range {v22 .. v22}, Lcom/twocloo/com/cn/utils/OtherUtils;->transferCount(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getUpcount()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 450
a=0;//     .local v16, "supportCount":I
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 451
a=0;//     new-instance v23, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "supportTotalCount"
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 450
a=0;//     invoke-virtual/range {v22 .. v24}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 452
a=0;//     .local v17, "supportTotalCount":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     sget-boolean v22, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_1
a=0;// 
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .end local v17    # "supportTotalCount":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v22=(Conflicted);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 454
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v22 .. v22}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-nez v22, :cond_2
a=0;// 
a=0;//     .line 455
a=0;//     const-string v22, "/2cloo/imgCache/"
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v22 .. v22}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getLogo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v10, v2}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     .line 459
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v22=(Conflicted);v24=(Reference,Ljava/lang/String;);
a=0;//     new-instance v22, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v11, v6}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/beans/Shuping_maininfo;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;);v22=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$3;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 484
a=0;//     new-instance v22, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v3, v18
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, v1, v11, v2, v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/beans/Shuping_maininfo;Landroid/widget/ImageView;Landroid/widget/TextView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;);v22=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$4;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 510
a=0;//     move v13, v9
a=0;// 
a=0;//     .line 511
a=0;//     .local v13, "n":I
a=0;//     #v13=(Integer);
a=0;//     new-instance v22, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v13}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;);v22=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$5;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 537
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglunLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 429
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 457
a=0;//     .end local v13    # "n":I
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v13=(Conflicted);v22=(Boolean);
a=0;//     sget v22, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v10, v0}, Lcom/twocloo/com/cn/view/CircleImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
a=0;//     .locals 7
a=0;//     .param p1, "group"    # Landroid/widget/RadioGroup;
a=0;//     .param p2, "checkedId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1148
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 1149
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1150
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     .line 1151
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     .line 1152
a=0;//     sput-boolean v6, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     .line 1154
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_pressed:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1155
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1158
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 1159
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_pressed:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1160
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1161
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1170
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 1227
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1164
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(One);v3=(PosByte);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_pressed:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1166
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1177
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_4
a=0;// 
a=0;//     .line 1178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1179
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     .line 1180
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     .line 1181
a=0;//     sput-boolean v6, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     .line 1182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->showKeyBoard(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1183
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 1184
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_pressed:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1185
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1186
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1193
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1195
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1196
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->enter_pinglun:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1197
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 1199
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isShowDialog:Z
a=0;// 
a=0;//     .line 1200
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isShowDialog:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ProgressBar;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/DownMuluTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;ZLandroid/widget/ProgressBar;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     .line 1201
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/DownMuluTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1189
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(PosByte);v2=(One);v3=(PosByte);v4=(PosByte);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_pressed:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1191
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1204
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 1205
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1206
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nowClickId:I
a=0;// 
a=0;//     .line 1207
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     .line 1208
a=0;//     sput-boolean v2, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     .line 1209
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 1210
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_pressed:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1211
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1212
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_black_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1219
a=0;//     :goto_3
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1222
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->enter_pinglun:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 1224
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setChecked(Z)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1214
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pinglun_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_pressed:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjie_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1216
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mulu_top_Btn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_title_button_normal:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 27
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 846
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 847
a=0;//     .local v23, "id":I
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 848
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goback()V
a=0;// 
a=0;//     .line 1096
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 849
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 850
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 851
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 854
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 855
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 856
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 858
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/com/cn/common/LocalStore;->getTuijian(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 859
a=0;//     const-string v2, "\u4f60\u5df2\u7ecf\u63a8\u8350\u8fc7\u672c\u4e66"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 862
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 863
a=0;//     .local v6, "token":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getVoters()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 865
a=0;//     .local v11, "tuijian_count":I
a=0;//     #v11=(Integer);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/task/TuijianTask;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/task/TuijianTask;);
a=0;//     const-string v4, "http://app.2cloo.com/user-rec?articleid=%s&token=%s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCountTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijianCount:Landroid/widget/TextView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tuijiancounticon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v3, p0
a=0;// 
a=0;//     .line 866
a=0;//     invoke-direct/range {v2 .. v11}, Lcom/twocloo/com/cn/task/TuijianTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;I)V
a=0;// 
a=0;//     .line 865
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/task/TuijianTask;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tjTask:Lcom/twocloo/com/cn/task/TuijianTask;
a=0;// 
a=0;//     .line 867
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->tjTask:Lcom/twocloo/com/cn/task/TuijianTask;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Void;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/task/TuijianTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 871
a=0;//     .end local v6    # "token":Ljava/lang/String;
a=0;//     .end local v11    # "tuijian_count":I
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shoucangCountlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_a
a=0;// 
a=0;//     .line 872
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 873
a=0;//     const-string v2, "\u8bf7\u5148\u767b\u5f55"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 874
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 884
a=0;//     :cond_6
a=0;//     #v0=(Integer);v3=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     .line 885
a=0;//     .local v26, "uid":Ljava/lang/String;
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 886
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 888
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_9
a=0;// 
a=0;//     .line 889
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTotalfavor()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v21, v2, 0x1
a=0;// 
a=0;//     .line 892
a=0;//     .local v21, "count":I
a=0;//     #v21=(Integer);
a=0;//     new-instance v20, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct/range {v20 .. v20}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 893
a=0;//     .local v20, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 894
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 895
a=0;//     .local v24, "imgurl":Ljava/lang/String;
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 897
a=0;//     .end local v24    # "imgurl":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v24=(Conflicted);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v26
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 898
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 899
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 900
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getFinishflag()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 901
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 902
a=0;//     new-instance v22, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 903
a=0;//     .local v22, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v22=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual/range {v22 .. v22}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 904
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 906
a=0;//     .end local v20    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v21    # "count":I
a=0;//     .end local v22    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_9
a=0;//     #v1=(Uninit);v2=(Boolean);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);
a=0;//     const-string v2, "\u4f60\u5df2\u7ecf\u6536\u85cf\u8fc7\u672c\u4e66"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 910
a=0;//     .end local v26    # "uid":Ljava/lang/String;
a=0;//     :cond_a
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v26=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->shareBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_b
a=0;// 
a=0;//     .line 912
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v2, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     .line 923
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$8;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$9;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$9;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$9;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     .line 933
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$9;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     .line 948
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$10;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$11;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$11;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v5, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$11;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     .line 912
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$11;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3, v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->sharelistDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 964
a=0;//     :cond_b
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->freeBtn:I
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     if-ne v0, v2, :cond_d
a=0;// 
a=0;//     .line 965
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 966
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 969
a=0;//     :cond_c
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 970
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getFirst_chapter_id()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 971
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getFirst_chapter_is_vip()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 972
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getFirst_vip_chapter_displayorder()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     move-object/from16 v12, p0
a=0;// 
a=0;//     .line 970
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static/range {v12 .. v19}, Lcom/twocloo/com/cn/utils/CommonUtils;->readOnline(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZ)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1003
a=0;//     :cond_d
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_12
a=0;// 
a=0;//     .line 1004
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     .line 1005
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 1007
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_f
a=0;// 
a=0;//     .line 1008
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1010
a=0;//     :cond_f
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->existBookBF(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_11
a=0;// 
a=0;//     .line 1011
a=0;//     const-string v2, "\u4e0b\u8f7d\u6210\u529f"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1012
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->down2:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1013
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v3, "\u5df2\u4e0b\u8f7d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1014
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$color;->qian_gray:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 1015
a=0;//     new-instance v20, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct/range {v20 .. v20}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 1016
a=0;//     .restart local v20    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1017
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     .line 1018
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 1019
a=0;//     .restart local v24    # "imgurl":Ljava/lang/String;
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1021
a=0;//     .end local v24    # "imgurl":Ljava/lang/String;
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v24=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1022
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1023
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getFinishflag()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 1024
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1025
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 1027
a=0;//     new-instance v22, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1028
a=0;//     .restart local v22    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v22=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual/range {v22 .. v22}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 1029
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1032
a=0;//     .end local v20    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v22    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_11
a=0;//     #v1=(Uninit);v2=(Boolean);v4=(Reference,Ljava/lang/String;);v20=(Uninit);v22=(Uninit);v24=(Uninit);
a=0;//     const-string v2, "\u4e66\u67b6\u5df2\u6709\u672c\u4e66"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1033
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u4e0b\u8f7d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1034
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->down2:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1035
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v3, "\u5df2\u4e0b\u8f7d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1039
a=0;//     :cond_12
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_14
a=0;// 
a=0;//     .line 1040
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_13
a=0;// 
a=0;//     .line 1041
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1042
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1045
a=0;//     :cond_13
a=0;//     #v0=(Integer);v2=(Boolean);v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v3, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1046
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     .line 1047
a=0;//     new-instance v12, Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v14=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     const/16 v17, 0x5
a=0;// 
a=0;//     #v17=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     move-object/from16 v13, p0
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct/range {v12 .. v19}, Lcom/twocloo/com/cn/threads/ShupingThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v12, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     .line 1048
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/threads/ShupingThread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1049
a=0;//     :cond_14
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewpinglunButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_15
a=0;// 
a=0;//     .line 1050
a=0;//     new-instance v25, Landroid/content/Intent;
a=0;// 
a=0;//     #v25=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/PinglunActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1051
a=0;//     .local v25, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v25=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "articleId"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1052
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1053
a=0;//     .end local v25    # "intent":Landroid/content/Intent;
a=0;//     :cond_15
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Integer);v3=(Uninit);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->viewMulu:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_16
a=0;// 
a=0;//     .line 1054
a=0;//     new-instance v25, Landroid/content/Intent;
a=0;// 
a=0;//     #v25=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MuLuActivity;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1055
a=0;//     .restart local v25    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v25=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "articleId"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1056
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1057
a=0;//     .end local v25    # "intent":Landroid/content/Intent;
a=0;//     :cond_16
a=0;//     #v1=(Uninit);v3=(Uninit);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->nopinglunlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-eq v0, v2, :cond_17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goPinglun:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_18
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_17
a=0;//     new-instance v25, Landroid/content/Intent;
a=0;// 
a=0;//     #v25=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/PublishPinglunActivity;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1059
a=0;//     .restart local v25    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v25=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "articleId"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1060
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1061
a=0;//     .end local v25    # "intent":Landroid/content/Intent;
a=0;//     :cond_18
a=0;//     #v1=(Uninit);v3=(Uninit);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_1a
a=0;// 
a=0;//     .line 1062
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isZhankai:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_19
a=0;// 
a=0;//     .line 1063
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1064
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v3, "\u6536\u8d77"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1065
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->shouqi:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v5, v7}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
a=0;// 
a=0;//     .line 1066
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isZhankai:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1068
a=0;//     :cond_19
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->sbxxy:Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v7, 0x64
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "..."
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1069
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v3, "\u5c55\u5f00"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1070
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->zhankaiButton:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->zhankai:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v5, v7}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
a=0;// 
a=0;//     .line 1072
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isZhankai:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1074
a=0;//     :cond_1a
a=0;//     #v2=(Reference,Landroid/widget/Button;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authornameTv:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_1b
a=0;// 
a=0;//     .line 1075
a=0;//     new-instance v25, Landroid/content/Intent;
a=0;// 
a=0;//     #v25=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/AuthorWorksActivity;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1076
a=0;//     .restart local v25    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v25=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "authorid"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->authorId:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1077
a=0;//     const-string v2, "title"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->title:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1078
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1079
a=0;//     .end local v25    # "intent":Landroid/content/Intent;
a=0;//     :cond_1b
a=0;//     #v1=(Uninit);v3=(Uninit);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_1c
a=0;// 
a=0;//     .line 1080
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1081
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goGeneralActivity(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1083
a=0;//     :cond_1c
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_1d
a=0;// 
a=0;//     .line 1084
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1085
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goGeneralActivity(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1087
a=0;//     :cond_1d
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_1e
a=0;// 
a=0;//     .line 1088
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1089
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goGeneralActivity(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1091
a=0;//     :cond_1e
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 1092
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1093
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookMarkBeans:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BookMarkBean;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BookMarkBean;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goGeneralActivity(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 14
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 570
a=0;//     #v13=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/openapi/QZoneAble;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 571
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->novel_detailed_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 572
a=0;//     sput-boolean v7, Lcom/twocloo/com/cn/activitys/SearchActivity;->isBackFromNovel:Z
a=0;// 
a=0;//     .line 573
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/Util;->getScreenWidth(Landroid/app/Activity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->screenWidth:I
a=0;// 
a=0;//     .line 574
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/Util;->getScreenHeigh(Landroid/app/Activity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->screenHeigh:I
a=0;// 
a=0;//     .line 575
a=0;//     sput-boolean v7, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isJumpToReply:Z
a=0;// 
a=0;//     .line 576
a=0;//     invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 577
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/view/Window;->setSoftInputMode(I)V
a=0;// 
a=0;//     .line 579
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 580
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 581
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 583
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->initViews()V
a=0;// 
a=0;//     .line 584
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->ScrollView:Lcom/twocloo/com/cn/view/MyScrollView;
a=0;// 
a=0;//     invoke-virtual {v0, v13, v13}, Lcom/twocloo/com/cn/view/MyScrollView;->scrollTo(II)V
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->horizontalScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$6;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$6;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$6;-><init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$6;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->horizontalScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;//     invoke-virtual {v0, v13}, Landroid/widget/HorizontalScrollView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 598
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->setTopBar()V
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->intent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 600
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->intent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "newbook"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 601
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "source"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->source:Ljava/lang/String;
a=0;// 
a=0;//     .line 603
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "Articleid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 604
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "flag"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     .line 606
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "wandoujia"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->intent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 608
a=0;//     .local v12, "uri":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 609
a=0;//     const-string v11, "[^0-9]"
a=0;// 
a=0;//     .line 610
a=0;//     .local v11, "regEx":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 611
a=0;//     .local v10, "p":Ljava/util/regex/Pattern;
a=0;//     #v10=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v10, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 612
a=0;//     .local v9, "m":Ljava/util/regex/Matcher;
a=0;//     #v9=(Reference,Ljava/util/regex/Matcher;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     .line 619
a=0;//     .end local v9    # "m":Ljava/util/regex/Matcher;
a=0;//     .end local v10    # "p":Ljava/util/regex/Pattern;
a=0;//     .end local v11    # "regEx":Ljava/lang/String;
a=0;//     .end local v12    # "uri":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->loading_text:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 620
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->source:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     .line 621
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->sbxxyth:Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/ShubenxinxiyeThread;->start()V
a=0;// 
a=0;//     .line 622
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/BookMarkThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/BookMarkThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, v2}, Lcom/twocloo/com/cn/threads/BookMarkThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/BookMarkThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/BookMarkThread;->start()V
a=0;// 
a=0;//     .line 624
a=0;//     new-instance v8, Lcom/twocloo/com/cn/task/LikeMoreTask;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/task/LikeMoreTask;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {v8, p0, v0, v1, v2}, Lcom/twocloo/com/cn/task/LikeMoreTask;-><init>(Landroid/app/Activity;Ljava/lang/String;ILandroid/os/Handler;)V
a=0;// 
a=0;//     .line 625
a=0;//     .local v8, "likemoreTask":Lcom/twocloo/com/cn/task/LikeMoreTask;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/task/LikeMoreTask;);
a=0;//     new-array v0, v13, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/task/LikeMoreTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 628
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     .line 629
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->loadMoreBtn:Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/threads/ShupingThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->spth:Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/ShupingThread;->start()V
a=0;// 
a=0;//     .line 632
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isShowDialog:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->pb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ProgressBar;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/DownMuluTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;ZLandroid/widget/ProgressBar;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/DownMuluTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     .line 633
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->downmuluTask:Lcom/twocloo/com/cn/task/DownMuluTask;
a=0;// 
a=0;//     new-array v1, v13, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/DownMuluTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 634
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 635
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 636
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 639
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTuijian(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 645
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->setCheckedid(I)V
a=0;// 
a=0;//     .line 646
a=0;//     return-void
a=0;// 
a=0;//     .line 614
a=0;//     .end local v8    # "likemoreTask":Lcom/twocloo/com/cn/task/LikeMoreTask;
a=0;//     .restart local v12    # "uri":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(PosByte);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bundle:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "Articleid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1246
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onDestroy()V
a=0;// 
a=0;//     .line 1247
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 1250
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 1252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDownMotionEvent()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1345
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1238
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 1239
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->goback()V
a=0;// 
a=0;//     .line 1240
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1242
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Lcom/twocloo/base/openapi/QZoneAble;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1309
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onPause()V
a=0;// 
a=0;//     .line 1310
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1311
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1312
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 1314
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1327
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onRestart()V
a=0;// 
a=0;//     .line 1328
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 1330
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1255
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onResume()V
a=0;// 
a=0;//     .line 1257
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->isOutway:Z
a=0;// 
a=0;//     .line 1258
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 1261
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->articleId:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1266
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->down2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1267
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v1, "\u5df2\u4e0b\u8f7d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1268
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->buyBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->qian_gray:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 1276
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjielayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1279
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->bookdetailedlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1280
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->xuxian:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1281
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line10:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1282
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line11:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1283
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line12:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1284
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line7:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1285
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line8:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1286
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line9:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1287
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line0:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1288
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1289
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1290
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1291
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1295
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->baoyueTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setNewflagBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1296
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->jianjieTv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setGrayTextColor(Landroid/app/Activity;Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 1298
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->flag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->setCheckedid(I)V
a=0;// 
a=0;//     .line 1300
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1301
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1305
a=0;//     return-void
a=0;// 
a=0;//     .line 1275
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->mululayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onScrollChanged(I)V
a=0;//     .locals 2
a=0;//     .param p1, "scrollY"    # I
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xb
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1335
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 1336
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->radioGroup_top:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioGroup;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->myview:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setTranslationY(F)V
a=0;// 
a=0;//     .line 1340
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1338
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->myview:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1317
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onStop()V
a=0;// 
a=0;//     .line 1321
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 1323
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUpOrCancelMotionEvent()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListViewHeightBasedOnChildren(Landroid/widget/ListView;)V
a=0;//     .locals 8
a=0;//     .param p1, "listView"    # Landroid/widget/ListView;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     .line 828
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 829
a=0;//     .local v1, "listAdapter":Landroid/widget/ListAdapter;
a=0;//     #v1=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 842
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 832
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 833
a=0;//     .local v4, "totalHeight":I
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     if-lt v0, v5, :cond_1
a=0;// 
a=0;//     .line 838
a=0;//     invoke-virtual {p1}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 839
a=0;//     .local v3, "params":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p1}, Landroid/widget/ListView;->getDividerHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     mul-int/2addr v5, v6
a=0;// 
a=0;//     add-int/2addr v5, v4
a=0;// 
a=0;//     iput v5, v3, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move-object v5, v3
a=0;// 
a=0;//     .line 840
a=0;//     #v5=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     invoke-virtual {v5, v7, v7, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 841
a=0;//     invoke-virtual {p1, v3}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 834
a=0;//     .end local v3    # "params":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v5=(Integer);v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1, v0, v5, p1}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 835
a=0;//     .local v2, "listItem":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v6, v6}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 836
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     .line 833
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
