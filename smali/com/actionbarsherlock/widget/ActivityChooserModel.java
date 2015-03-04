package com.actionbarsherlock.widget; class ActivityChooserModel { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// .super Landroid/database/DataSetObservable;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityChooserModelClient;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;,
a=0;//         Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRIBUTE_ACTIVITY:Ljava/lang/String; = "activity"
a=0;// 
a=0;// .field private static final ATTRIBUTE_TIME:Ljava/lang/String; = "time"
a=0;// 
a=0;// .field private static final ATTRIBUTE_WEIGHT:Ljava/lang/String; = "weight"
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final DEFAULT_ACTIVITY_INFLATION:I = 0x5
a=0;// 
a=0;// .field private static final DEFAULT_HISTORICAL_RECORD_WEIGHT:F = 1.0f
a=0;// 
a=0;// .field public static final DEFAULT_HISTORY_FILE_NAME:Ljava/lang/String; = "activity_choser_model_history.xml"
a=0;// 
a=0;// .field public static final DEFAULT_HISTORY_MAX_LENGTH:I = 0x32
a=0;// 
a=0;// .field private static final HISTORY_FILE_EXTENSION:Ljava/lang/String; = ".xml"
a=0;// 
a=0;// .field private static final INVALID_INDEX:I = -0x1
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static final SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static final TAG_HISTORICAL_RECORD:Ljava/lang/String; = "historical-record"
a=0;// 
a=0;// .field private static final TAG_HISTORICAL_RECORDS:Ljava/lang/String; = "historical-records"
a=0;// 
a=0;// .field private static final sDataModelRegistry:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActivites:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mActivityChoserModelPolicy:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// .field private mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;// .field private mCanReadHistoricalData:Z
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mHistoricalRecords:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mHistoricalRecordsChanged:Z
a=0;// 
a=0;// .field private final mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;// .field private mHistoryMaxSize:I
a=0;// 
a=0;// .field private final mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private mReadShareHistoryCalled:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     const-class v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 229
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     .line 564
a=0;//     invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "historyFileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 352
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObservable;-><init>()V
a=0;// 
a=0;//     .line 234
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     .line 244
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     .line 264
a=0;//     new-instance v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .line 269
a=0;//     const/16 v0, 0x32
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     .line 279
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     .line 290
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     .line 298
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 353
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 354
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     const-string v0, ".xml"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 356
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ".xml"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 360
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 358
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/widget/ActivityChooserModel;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsLocked()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sortActivities()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     sget-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private addHisoricalRecord(Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;//     .locals 3
a=0;//     .param p1, "historicalRecord"    # Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 678
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 679
a=0;//     .local v0, "added":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 680
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 681
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsLocked()V
a=0;// 
a=0;//     .line 682
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->persistHistoricalData()V
a=0;// 
a=0;//     .line 683
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sortActivities()V
a=0;// 
a=0;//     .line 685
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 677
a=0;//     .end local v0    # "added":Z
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static get(Landroid/content/Context;Ljava/lang/String;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "historyFileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     sget-object v2, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 336
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     .line 337
a=0;//     .local v0, "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 338
a=0;//     new-instance v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     .end local v0    # "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     .restart local v0    # "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 341
a=0;//     :cond_0
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->readHistoricalData()V
a=0;// 
a=0;//     .line 342
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 335
a=0;//     .end local v0    # "dataModel":Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private loadActivitiesLocked()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 712
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 715
a=0;//     .local v3, "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 716
a=0;//     .local v2, "resolveInfoCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 720
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sortActivities()V
a=0;// 
a=0;//     .line 724
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "resolveInfoCount":I
a=0;//     .end local v3    # "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 717
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "resolveInfoCount":I
a=0;//     .restart local v3    # "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,Ljava/util/List;);v5=(Reference,Ujava/lang/Object;);v6=(Null);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 718
a=0;//     .local v1, "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     new-instance v5, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;);
a=0;//     invoke-direct {v5, p0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Landroid/content/pm/ResolveInfo;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 716
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 722
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v2    # "resolveInfoCount":I
a=0;//     .end local v3    # "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private persistHistoricalData()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 577
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 578
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "No preceding call to #readHistoricalData"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 576
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 580
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 581
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 589
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 584
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 586
a=0;//     sget-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-instance v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, p0, v3}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryPersister;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 576
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pruneExcessiveHistoricalRecordsLocked()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 693
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     .line 694
a=0;//     .local v0, "choiceRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v2, v3, v4
a=0;// 
a=0;//     .line 695
a=0;//     .local v2, "pruneCount":I
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 698
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 699
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 700
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 699
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private readHistoricalData()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 553
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 554
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 562
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 556
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     .line 557
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 559
a=0;//     sget-object v0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-instance v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, p0, v3}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 552
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private sortActivities()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 616
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     .line 618
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 617
a=0;//     invoke-interface {v0, v2, v3, v4}, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;->sort(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 619
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     .line 615
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 622
a=0;//     return-void
a=0;// 
a=0;//     .line 615
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public chooseActivity(I)Landroid/content/Intent;
a=0;//     .locals 9
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 456
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 458
a=0;//     .local v2, "chosenActivity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     new-instance v3, Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 459
a=0;//     #v3=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v6, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     iget-object v6, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v7, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v7, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 458
a=0;//     invoke-direct {v3, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 462
a=0;//     .local v3, "chosenName":Landroid/content/ComponentName;
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 463
a=0;//     .local v0, "choiceIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 465
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 467
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 468
a=0;//     .local v1, "choiceIntentCopy":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     invoke-interface {v6, p0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;->onChooseActivity(Lcom/actionbarsherlock/widget/ActivityChooserModel;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 470
a=0;//     .local v4, "handled":Z
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 471
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     .end local v0    # "choiceIntent":Landroid/content/Intent;
a=0;//     .end local v1    # "choiceIntentCopy":Landroid/content/Intent;
a=0;//     .end local v4    # "handled":Z
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 475
a=0;//     .restart local v0    # "choiceIntent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v5=(Uninit);v6=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;);v7=(Reference,Ljava/lang/String;);v8=(Uninit);
a=0;//     new-instance v5, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 476
a=0;//     #v5=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/high16 v8, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 475
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v5, v3, v6, v7, v8}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V
a=0;// 
a=0;//     .line 477
a=0;//     .local v5, "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-direct {p0, v5}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->addHisoricalRecord(Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 415
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 414
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityCount()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 401
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 400
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityIndex(Landroid/content/pm/ResolveInfo;)I
a=0;//     .locals 5
a=0;//     .param p1, "activity"    # Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     .line 428
a=0;//     .local v0, "activities":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;>;"
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 429
a=0;//     .local v1, "activityCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     if-lt v3, v1, :cond_1
a=0;// 
a=0;//     .line 435
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .end local v3    # "i":I
a=0;//     :cond_0
a=0;//     return v3
a=0;// 
a=0;//     .line 430
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_1
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 431
a=0;//     .local v2, "currentActivity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     iget-object v4, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     if-eq v4, p1, :cond_0
a=0;// 
a=0;//     .line 429
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 506
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 501
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 506
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getHistoryMaxSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 655
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 654
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getHistorySize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 665
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 666
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 665
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 388
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 387
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActivitySorter(Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;)V
a=0;//     .locals 2
a=0;//     .param p1, "activitySorter"    # Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 600
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 601
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 606
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 603
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivitySorter:Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .line 604
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sortActivities()V
a=0;// 
a=0;//     .line 599
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setDefaultActivity(I)V
a=0;//     .locals 7
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 520
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 521
a=0;//     .local v2, "newDefaultActivity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivites:Ljava/util/List;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 524
a=0;//     .local v3, "oldDefaultActivity":Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 526
a=0;//     iget v5, v3, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     .line 527
a=0;//     #v5=(Float);
a=0;//     const/high16 v6, 0x40a00000    # 5.0f
a=0;// 
a=0;//     .line 526
a=0;//     add-float v4, v5, v6
a=0;// 
a=0;//     .line 532
a=0;//     .local v4, "weight":F
a=0;//     :goto_0
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 533
a=0;//     #v0=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v5, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 534
a=0;//     iget-object v6, v2, Lcom/actionbarsherlock/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v6, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v6, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 532
a=0;//     invoke-direct {v0, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 535
a=0;//     .local v0, "defaultName":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 536
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 535
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-direct {v1, v0, v5, v6, v4}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V
a=0;// 
a=0;//     .line 537
a=0;//     .local v1, "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->addHisoricalRecord(Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;// 
a=0;//     .line 538
a=0;//     return-void
a=0;// 
a=0;//     .line 529
a=0;//     .end local v0    # "defaultName":Landroid/content/ComponentName;
a=0;//     .end local v1    # "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     .end local v4    # "weight":F
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Reference,Ljava/util/List;);v6=(Null);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .restart local v4    # "weight":F
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setHistoryMaxSize(I)V
a=0;//     .locals 2
a=0;//     .param p1, "historyMaxSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 640
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 646
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 642
a=0;//     :cond_0
a=0;//     iput p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     .line 643
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsLocked()V
a=0;// 
a=0;//     .line 644
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->sortActivities()V
a=0;// 
a=0;//     .line 638
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 373
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 379
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 376
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 377
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->loadActivitiesLocked()V
a=0;// 
a=0;//     .line 372
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnChooseActivityListener(Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Lcom/actionbarsherlock/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .line 489
a=0;//     return-void
a=0;// .end method
}}
