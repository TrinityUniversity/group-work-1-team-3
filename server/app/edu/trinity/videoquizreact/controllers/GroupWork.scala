package edu.trinity.videoquizreact.controllers

import javax.inject._

import edu.trinity.videoquizreact.shared.SharedMessages
import play.api.mvc._

@Singleton
class GroupWork @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def groupWork = Action {
    Ok("Test String")
  }

  def listNames = Action {
    val names = List("Christian", "Chet", "Dane", "Kevin")
    Ok(views.html.PlayTemplate(names))
  }

  def table = Action {
    
    val rawData = """ 
                team                won   lost
                AtlantaHawks         28   54 
                BostonCeltics        36   46 
                NOrleansHornets      41   41 
                ChicagoBulls         23   59 
                ClevelandCavaliers   35   47 
                DallasMavericks      52   30 
                DenverNuggets        43   39 
                DetroitPistons       54   28 
                GSWarriors           37   45 
                HoustonRockets       45   37 
                IndianaPacers        61   21 
                LAClippers           28   54 
                LALakers             56   26 
                MiamiHeat            42   40 
                MilwaukeeBucks       41   41 
                MinnesotaT-wolves    58   24 
                NJNets               47   35 
                NYKnicks             39   43 
                OrlandoMagic         21   61 
                Philadelphia76ers    33   49 
                PhoenixSuns          29   53 
                PortlandTrailBlazers 41   41 
                SacramentoKings      55   27 
                SanAntonioSpurs      57   25 
                SeattleSupersonics   37   45 
                TorontoRaptors       33   49 
                UtahJazz             42   40 
                MemphisGrizzlies     50   32 
                WashingtonWizards    25   57 """
    val filteredData = rawData.trim().split('\n').map((data) => data.split(/\s+/));

                val table = List(List())
    Ok(views.html.PlayTemplate(table))
  }
}


